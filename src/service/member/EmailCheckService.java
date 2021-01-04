package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.LoginResponseDTO;
import dto.MemberDTO;
import service.MemberService;

public class EmailCheckService implements MemberService {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// email 중복 체크 서비스
		String email = request.getParameter("email");
		int result=dao.emailCheck(email);
		
		// $.post() : function(result){} 의 파라미터 변수로 넘겨준다. result 에 대한 결과값을 응답해주는 부분
		response.getWriter().println(result);
		
		// 페이지 이동할게아니므로 null처리.
		return null;

	}
}
