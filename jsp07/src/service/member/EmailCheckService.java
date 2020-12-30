package service.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MyService;

public class EmailCheckService implements MyService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email=request.getParameter("email");
		//System.out.println("email : "+ email);
		
		int n=dao.selectEmail(email);
		//존재하면 1(사용불가), 존재하지않으면 0 (사용가능)
		//System.out.println("n :"+ n);
		
		response.setCharacterEncoding("utf-8");
		PrintWriter pw=response.getWriter();
		pw.println(n);
		
		return null;
	}

}
