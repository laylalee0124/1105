package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.layla")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		///////// login.jsp에서 form을 통해 넘겨받은 name으로 저장된 정보를 받을준비 ///////////
		// 한글이 넘어올수있으므로 인코딩준비
		request.setCharacterEncoding("utp-8");
		
		// 저장할 변수값 설정
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String idSave=request.getParameter("idSave");
		
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
			System.out.println("아이디저장하지않음");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
