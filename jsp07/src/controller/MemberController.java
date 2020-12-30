package controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;

import service.MyService;

@WebServlet("*.me")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MyService service;
	String path;
	
	private Map<String, MyService> serveceMap;
	
	
	
	@Override
	public void init() throws ServletException {
		serveceMap=new HashMap<>();
		try {
			Properties prop=
					Resources.getResourceAsProperties("config/service-config.properties");
			Set<Object> sets=prop.keySet();
			for(Object obj : sets) {
				//저장할 key생성
				String key=(String)obj;
				System.out.println(key);
				//저장할 MyService객체 생성
				String className=(String)prop.get(obj);
				System.out.println(className);
				try {
					MyService myService=(MyService)Class.forName(className).getDeclaredConstructor().newInstance();
					
					//Map에 저장(key, service객체)
					serveceMap.put(key, myService);
					
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException
						| ClassNotFoundException e) {
					e.printStackTrace();
				}
				
			}//for()
			System.out.println("Service준비완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri=request.getRequestURI();
		String[] strs=uri.split("/");
		String key=strs[strs.length-1];
		/*
		//처리할 서비스 선택
		if(key.equals("reg.me")) {
			service=new MemberRegService();
		}else if(key.equals("emailCheck.me")) {
			service=new EmailCheckService();
		}else if(key.equals("login.me")) {
			service=new LoginService();
		}else if(key.equals("logout.me")) {
			service=new LogoutService();
		}
		*/
		//////////////////////////////////////////////////////////////
		service=serveceMap.get(key);
		//////////////////////////////////////////////////////////////
		
		//서비스 실행 후 이동할 페이지정보리턴
		if(service != null) {
			path=service.execute(request, response);
		}
		
		//path로 페이지 이동
		if(path != null) {
			request.getRequestDispatcher(path).forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
