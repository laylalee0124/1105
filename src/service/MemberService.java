package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

public interface MemberService {

	// member dao객체를 memberservice안에 생성해둠으로써 타 클래스에서 MemberService를 상속받으면 dao객체 생성없이 바로 사용할수있도록 함
	MemberDAO dao=new MemberDAO();
	
	// 추상 method로 생성하여 타 service class에서 @override하여 사용할수있도록 함.
	// Q. 멧서드를 스트링 타입으로 만드는 이유는?
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException;

}
