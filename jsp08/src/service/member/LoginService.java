package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dto.LoginDTO;
import dto.LoginResponseDTO;
import service.MemberService;

public class LoginService implements MemberService{


	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// membercontroller에 만들어 뒀던 로그인 구조를 따로 파일로 만든것.
		
		
		/////////////////// login.jsp에서 form을 통해 넘겨받은 name으로 저장된 정보를 받을준비 /////////////////////////////////////////////////////////
		// 한글이 넘어올수있으므로 인코딩준비
		request.setCharacterEncoding("utf-8");
		
		// 저장할 변수값 설정
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String idSave=request.getParameter("idSave");
		
		
		////////////////////////////////////  쿠키 만들기 ////////////////////////////////////////////////
		// 체크박스정보가 제대로 넘어왓는지 보기
		System.out.println("idSave: " + idSave);
		
		// 만약 체크박스정보가 on이면 아이디저장. 조건문을 idSave != null 로 설정해서 진행도 가능.
		// 아래처럼 설정하면 이중으로 체크할 수 있음. 단 조건문 앞뒤가 바뀌면 안될수있음.
		if(idSave!=null && idSave.equals("on")) {
			System.out.println("아이디 쿠키 저장");
			
			// 쿠키생성. syntax는 찾아보기.
			Cookie cookieID=new Cookie("userID", email);
			Cookie cookiePW=new Cookie("userPW", pass);
			
			//쿠키 유지할 시간 설정 (초)
			cookieID.setMaxAge(5);
			cookiePW.setMaxAge(5);
			
			// 브라우저에 쿠키애드하는걸 응답해줌.
			// 쿠키는 브라우저에 저장
			response.addCookie(cookieID);
			response.addCookie(cookiePW);
			
		}else{
			System.out.println("아이디 저장하지 않음");
			// 쿠키생성. syntax는 찾아보기.
			Cookie cookieID=new Cookie("userID", "");
			Cookie cookiePW=new Cookie("userPW", "");

			//쿠키 유지할 시간 설정 (초)
			cookieID.setMaxAge(0);
			cookiePW.setMaxAge(0);
			
			// 브라우저에 쿠키애드하는걸 응답해줌.
			// 쿠키는 브라우저에 저장
			response.addCookie(cookieID);
			response.addCookie(cookiePW);
			
			
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////브라우저에서 받은 정보로 DB에 정보있는지 확인후 로그인 처리 //////////////////////////////////////////////////////////////////////////
		MemberDAO dao= new MemberDAO();
		LoginDTO dto = new LoginDTO();
		dto.setEmail(email);
		dto.setPass(pass);

		// 둘다 제대로 입력하면 객체가넘어오고, 둘중뭐라도 안맞으면 null이 넘어옴.
		LoginResponseDTO result = dao.login(dto);
		System.out.println(result);
		
		if(result==null) {
			//ID or PW가 일치하지않는 경우
			request.setAttribute("logMsg", "ID나 PW가 다릅니다");
			return "/View/member/login.jsp";
		}else {
			// 둘다 일치하는경우 : 로그인처리
			// resulf의 값을 가지고 세선객체 만들어서 login 데이터 저장
			HttpSession session=request.getSession();
			session.setAttribute("logInfo", result);
			response.sendRedirect("/"); /* 인덱스페이지를 리턴 */
			return null; /* 현재상황 종료 */
		}
	}
}
