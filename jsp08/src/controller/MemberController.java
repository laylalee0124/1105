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

import service.MemberService;

////////// url pattern을 가지고, 처리할 서비스를 결정해줌 /////////////

@WebServlet("*.layla")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private MemberService service;
	private String path;
		
	// 아래에서 map에 key & value(object형태)를 저장하기위해서 미리 변수 선언해줌.
	private Map<String, MemberService> serviceMap;
	
	
	@Override
	public void init() throws ServletException { // 이니트가 돌아가면서 멤버서비스가 객체형태로 저장됨.
		// TODO Auto-generated method stub
		

		//------기존의 과정 자체가 문자열을 프로퍼티즈에서 읽어들여서 class를 통해 객체화 하는과정이라 시간이 오래걸림 	// 커넥션 풀을 이용해서 처리속도를 올릴수있지않을까? -------
		// 코드 100줄을 치더라도 처리속도가 빠르게할수잇다면 해야함.
		// 개선을 위해 프로퍼티파일에서 class 정보 읽어 들ㅇ니후 객채로 만들어서 map에다 저장하는 방식으로 변경
			serviceMap=new HashMap<String, MemberService>(); // hashmap이뭔지 알아보자...
			
				//서비스 선택 생성. 키값을 가지고 움직이도록 만들것.
				//service = new LoginService();
				// 프로프티에 저장해놨던 것을 가져오기 / // 주소가 길어서 변수에 저장해준것일뿐. 직접입력해도 무방함.
				String file="/service/member/member-service.properties";
				Properties prop=null; //프로퍼티의 정보를 담고있는 collection <String, String>의 형태로 정보를 담고있다.
				try {
					prop=Resources.getResourceAsProperties(file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
				
				
				// Set<Object>는 .ketset()의 저장유형이므로 걍외우기. 
				Set<Object> set = prop.keySet(); // set공부 다시해보자.
				for(Object obj : set) { 
					// 상기 Map에 설정한 <String, > 에 해당하는 key생성
					String key=(String)obj; // string으로 강제 casting
					String className= (String)prop.get(key);
					// properties파일내에 key&value형태로 저장한 class 경로인 value를 가지고 아까 저장해둔 uri정보를 Properties객체로 가져옴.
					
					// class.forname이 하는일이뭐지?
					// 이 구문이하는일은?? 객체를 만드는 과정.
					// 얘도 계속쓰는 구문이니 저장해놔도됨.
					try {
						Class clazz = Class.forName(className);
						MemberService service = (MemberService)clazz.getDeclaredConstructor().newInstance();
						
						// 만들어둔 serviceMap에 key & value 저장
						serviceMap.put(key, service);
						
					} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
							| InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
						e.printStackTrace();
					}
				}

						
	}
	
	
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		// 요청된 uri정보를 변수에 저장 : 이정보에 따라 처리될 서비스가 결정된다. 어떤uri에 어떤서비스가 요청될지는 member-service.properties에 저장되어있음. 
		String uri=request.getRequestURI();
		
		// 서비스 선택 생성
		service=serviceMap.get(uri);
		System.out.println("uri: "+uri);
		//////////////////////////////////////////////////
		
		//서비스실행후 이동할 페이지정보리턴
		if(service==null)
			path=service.process(request, response);
			System.out.println("path: "+path);
			
		//페이지 이동 (path가 null이 아닐때)
		if(service!=null) {
			request.getRequestDispatcher(path).forward(request, response); // request, response정보를 path로 forward해주면서 jsp로 보내줌.
		}else {
			System.out.println("service가 null입니다.");
		}
		
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
