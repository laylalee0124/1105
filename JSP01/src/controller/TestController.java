package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/haha"})
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서버 요청시 doGet이 실행 됩니다.");
		request.setCharacterEncoding("utf-8");
		
		String name=request.getParameter("name");
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");
		int counter=Integer.parseInt(request.getParameter("counter")); 
		
		System.out.println("name : "+name); 
		System.out.println("subject: "+subject);
		System.out.println("content: "+content);
		System.out.println("counter: "+counter);
		
		
		
		// DB driver설치
		try {
			Class.forName("oracle.jdbc.OracleDriver").getDeclaredConstructor().newInstance();
			System.out.println("DB드라이버설치");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// connection 객체생성.
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="layla";
		String password="oracle";
		
		try {
			Connection conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 완료");
			
			String sql="insert into test1 values (SEQ_TEST1.nextval, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, subject);
			pstmt.setString(3, content);
			pstmt.setInt(4, counter);
			
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
