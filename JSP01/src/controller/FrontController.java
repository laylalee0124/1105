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



// html(join) page에서 받은 정보를 가지고 동작하는 부분

@WebServlet("/reg")
// 아래에 있는 구문을 실행시킬 구문을 "/FrontController"이걸로 지정해준다는 의미.
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서버 요청시 doGet이 실행 됩니다.");
		//Get방식의 data 수집방식 http://localhost/JSP01/reg?name=%EC%9D%B4%EB%A6%84&sal=299

		// 서버에 넘어온 정보의 데이터 인코딩 타입 지정.
		request.setCharacterEncoding("utf-8");
		
		// 서버에 받아들일 정보 타입 지정.
		String name=request.getParameter("name");
		int sal=Integer.parseInt(request.getParameter("sal")); 
			// wrapper class인 Integer.parseInt를 통해서 문자열을 숫자열로 변환해서 sal에 int형으로 저장.

		// 정보를 받아서 서버에 출력
		System.out.println("name : "+name); 
		System.out.println("salary: "+sal);
		
		
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
			
			// 'test' 테이블에 정보집어넣기
			String sql="insert into test values (SEQ_TEST.nextval, ?, ?) ";
				// DB에서 시퀀스 사용할땐 .nextval로 사용햇엇음.
			
			// preparedstatement사용하여 quary문 쓰기.
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
