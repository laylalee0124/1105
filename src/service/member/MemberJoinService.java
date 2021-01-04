package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.MembeJoinDTO;
import service.MemberService;

public class MemberJoinService implements MemberService {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String ip = request.getRemoteAddr();
		
		MembeJoinDTO dto = new MembeJoinDTO(); 
		dto.setEmail(email);
		dto.setName(name);
		dto.setPass(pass);
		dto.setIp(ip);
		
		dao.join(dto); 

		request.setAttribute("welcomeLog", name+"님,<br>회원가입이 완료되었습니다.<br>로그인 후에 이용가능합니다.<br>");
		return "login.jsp";

	}
}
