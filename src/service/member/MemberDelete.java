package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.LoginResponseDTO;
import service.MemberService;

public class MemberDelete implements MemberService {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 파라미터에서 정보를 얻어오는방법
		//int no = Integer.parseInt(request.getParameter("no"));
		
		//세션에서 정보를 얻어오는 방법
		HttpSession session=request.getSession();
		LoginResponseDTO loginfo = (LoginResponseDTO)session.getAttribute("logInfo");
		int no=loginfo.getNo();
		dao.delete(no);  // 여기서 이거 써놓고 auto로 memberDAO에 delete생성.
		session.removeAttribute("logInfo");
		response.sendRedirect("/");
		return null;
	}
}
