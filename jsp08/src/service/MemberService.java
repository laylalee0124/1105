package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

public interface MemberService {

	MemberDAO dao=new MemberDAO();
	
	// 인터페이스로 생성
	// 서비스 실행 명령어
	// 멧서드를 스트링 타입으로 만드는 이유는?
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException;

}
