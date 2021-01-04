package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.LoginDTO;
import dto.LoginResponseDTO;
import service.MemberService;

public class LoginService implements MemberService{

	/*
	 1) MemberService를 상속받아 MemberDAO dao=new MemberDAO(); 객체를 static way로 사용할 수 있음
	 2) 추상 method인 process()를 override하여 사용할 수 있음
	 */
	
	@Override
	// DB정보와 비교하여 login처리하고, 필요에따라 session에 id/pw를 저장
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//-------(View) Login.jsp에서 form tag를 통해 넘겨받은 정보를 저장-------
		// 한글 정보를 저장할 수 있도록 인코딩 준비
		request.setCharacterEncoding("utf-8");
		
		// 각 변수값에 넘어온 정보 저장
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String idSave=request.getParameter("idSave");
		
		
		//-------쿠키 만들기-------
		// (View) Login.jsp에서 idSave로 만들어둔 체크박스가 on이면 id/pw를 쿠키에 저장.
		if(idSave!=null && idSave.equals("on")) { // 이렇게 설정하면 이중으로 체크할 수 있음. 단 조건문 앞뒤가 바뀌면 안될수있음.
			System.out.println("ID/PW 쿠키 저장");
			
			// 쿠키생성. syntax는 찾아보기.
			Cookie cookieID=new Cookie("userID", email);
			Cookie cookiePW=new Cookie("userPW", pass);
			
			// 쿠키 유지할 시간 설정 (초)
			// 쿠키는 client browser에 저장되며, 브라우저가 종료되기전까지는 setMaxAge에 따라 쿠키 유지.
			cookieID.setMaxAge(60*60*24*365);
			cookiePW.setMaxAge(60*60*24*365);
			
			// 브라우저에 쿠키애드하는걸 응답해줌.
			// 쿠키는 브라우저에 저장
			response.addCookie(cookieID);
			response.addCookie(cookiePW);
			
		}else{
			System.out.println("ID/PW 저장하지 않음");
			Cookie cookieID=new Cookie("userID", "");
			Cookie cookiePW=new Cookie("userPW", "");
			cookieID.setMaxAge(0);
			cookiePW.setMaxAge(0);
			response.addCookie(cookieID);
			response.addCookie(cookiePW);
		}
		
		
		//-------브라우저에서 받은 정보로 DB에 정보있는지 확인후 로그인 처리-------
		// model(DTO)에 아까 변수에 저장했던 정보 넘겨서 셋팅.
		LoginDTO dto = new LoginDTO();
		dto.setEmail(email);
		dto.setPass(pass);

		// dto정보를 가지고 dao의 login()를 실행. 가져온 정보(logdate=no, email, pass)는 같은 class(no, email, pass를 담을수있는)인 LoginResponseDTO result에 저장해준다.
		LoginResponseDTO result = dao.login(dto);	// no, email, pass
		// 둘 다 제대로 입력하면 객체가 넘어오고, 둘 중 뭐라도 안맞으면 null이 넘어옴.
		System.out.println("dao.login(dto) result= email/pass로 DB조회한 결과 =" + result);
		
		if(result==null) {
			// email/pass 일치 하지 않는 경우 : request에 msg 셋팅해주고 페이지리턴.
			// HttpServletRequest=request 에다가 key&value 셋팅. key값은 login.jsp페이지에서 EL식으로 가져와서 출력가능.
			request.setAttribute("logMSG", "ID나 PW가 다릅니다");
			// 완료된 후 리턴할 페이지 주소
			return "/View/member/login.jsp";
		}else {
			// email/pass 일치 하는 경우 : 로그인 처리
			// request의 getSession() 메서드는 서버에 생성된 세션이 있다면 세션을 반환하고, 없다면 새 세션을 생성하여 반환한다. (인수 default가 true)
			HttpSession session=request.getSession();
			// result의 값(no, email, pass)을 session에 logInfo이름으로 셋팅 해준다.
			session.setAttribute("logInfo", result);
			// 로그인 서비스가 끝났으므로, 루트페이지(인덱스페이지)를 브라우저쪽으로 response해준다.
			response.sendRedirect("/");
			// 서버쪽에는 더 할일없으므로 현재상황 종료를위해 null을 리턴한다.
			return null; 
		}
	}
}
