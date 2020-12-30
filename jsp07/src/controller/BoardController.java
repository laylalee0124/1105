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

import service.BoardService;
import service.board.BoardIndexService;


@WebServlet("*.bo")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardService service;
	private String path;
	
	
	private Map<String, BoardService> seviceMap;
	
	@Override
	public void init() throws ServletException {
		seviceMap=new HashMap<String, BoardService>();
		try {
			Properties prop=Resources.getResourceAsProperties("config/service-board.properties");
			Set<Object> set=prop.keySet();
			
			for(Object obj:set) {
				//key
				String key=(String )obj;
				
				String className=(String)prop.get(key);
				try {
					//service 객체
					BoardService service=(BoardService)Class.forName(className).getDeclaredConstructor().newInstance();
					//map에 저장
					seviceMap.put(key, service);
					
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException
						| ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri=request.getRequestURI();
		String[] strs=uri.split("/");
		String key=strs[strs.length-1];
		//서비스 선택
		service=seviceMap.get(key);
		
		//서비스 실행
		if(service!=null)
			path=service.execute(request, response);
		
		//페이지이동
		if(path!=null)
			request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
