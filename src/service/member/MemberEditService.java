package service.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dto.LoginResponseDTO;
import dto.MemberDTO;
import dto.MemberEditDTO;
import service.MemberService;

public class MemberEditService implements MemberService {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ajax를통해 data넘어왓을것임
		// Integer.parseInt()를 가지고 string <-> int 강제형변환 가능.
		String pass = request.getParameter("pass");
		int no = Integer.parseInt(request.getParameter("no"));

		// DB에 접근
		// DAO가지고 editpass로 데이터 넘겨줌.
		// 이때 DTO라는 박스를 써서 여러개 데이터를 담아 한꺼번에 넘겨줌.
		MemberEditDTO dto = new MemberEditDTO(); // 만들어놓은 박스 가져오기 - DTO객체 생성
		dto.setNo(no); // 박스에 데이터담기
		dto.setPass(pass); // 박스에 데이터담기

		// memverservice가 memberDAO를 상속중이므로 dao사용가능.
		dao.editPass(dto); // 박스써서 dao로 DB에 접근하여 데이터 넘겨줌.

		return null;

	}
}
