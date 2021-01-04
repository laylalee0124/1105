package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.LoginResponseDTO;
import dto.MemberDTO;
import service.MemberService;

public class MemberInfoService implements MemberService {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 일단 세션정보가져오기
		HttpSession session=request.getSession();

		// 세션에 저장된 정보를 LoginResponseDTO 에있는 객체에 저장.
		LoginResponseDTO logData=(LoginResponseDTO) session.getAttribute("logInfo");
		int no=logData.getNo();
		System.out.println(no);
		
		// no값을 가져와서
		// MemberService를 상속받고있기 때문에 daoㄹ르 쓸수있음.
		MemberDTO result = dao.memberInfo(no);
		request.setAttribute("mInfo", result); // request를 통해 이름과 값을 셋팅해줌.
		System.out.println(result+"result");
		
		return "/View/member/memberInfo.jsp"; /* 현재상황 종료 */

	}
}
