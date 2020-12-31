package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.MemberService;

public class LogoutService implements MemberService{


	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	// 일단 세션정보를 가져와서
	HttpSession session=request.getSession();
	
	// 로그아웃을 위해 "logInfo"라는 이름의 세션 정보를 삭제 해주면 된다.
	session.removeAttribute("logInfo");
		
	response.sendRedirect("/"); /* 인덱스페이지를 리턴 */
	return null; /* 현재상황 종료 */
		
	}
}
