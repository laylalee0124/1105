package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.LogRequestDTO;
import dto.LogResponseDTO;
import service.MyService;

public class LoginService implements MyService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		LogRequestDTO dto=new LogRequestDTO();
		dto.setEmail(email);
		dto.setPass(pass);
		
		//아이디(이메일)와 패스워드 가 모두 일치하면 회원이 존재 로그인처리
		LogResponseDTO logData=dao.login(dto);
		
		//System.out.println("logData : "+logData);
		//logData가 null이면 로그인 실패
		if(logData!=null) {
			//로그인 처리
			//세션에 정보저장
			HttpSession session=request.getSession();
			session.setAttribute("login", logData);
			return "/";
		}
		
		return "login.jsp";
	}

}
