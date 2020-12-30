package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.MemberRequestDTO;
import service.MyService;

public class MemberRegService implements MyService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//회원가입서비스
		//1.등록한 정보 읽어들인다.
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String name=request.getParameter("name");
		String ip=request.getRemoteAddr();
		MemberRequestDTO dto=new MemberRequestDTO(email, pass, name, ip);
		dao.insert(dto);
		String msg="회원가입이 정상적으로 처리되었습니다.<br>로그인후 이용하시기 바랍니다.";
		request.setAttribute("logMsg", msg);
		return "login.jsp";
	}


}
