package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleTest01 {
	public static void main(String[] args) {

		// DB설치를 위해서는 먼저 Driver가 필요하다.
		// forName을 이용해서 필요한 driver를 찾아깔면된다.

		// -----------Driver 설치-----------------
		String driver = "oracle.jdbc.OracleDriver";
		try {
			Class.forName(driver).getDeclaredConstructor().newInstance();
			System.out.println("드라이버 설치완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		// -----------Orcle DB연결-----------------
		// Data Source : DB연결 정보
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "layla";
		String password = "oracle";
		
		// DB연결
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to DB !");

			// =================연결한 DB에 DML(Data Manipulation Languige : CRUD)쿼리 적용해보기=================
			/*
			String subject="로또 1등";
			int count = 3;
			
			String sql = "insert into board " // 띄워쓰기 주의!
					+ "values(seq_board.nextval, ?, 'content', sysdate, ?, '작성자')"; // 변수처리할부분을 ?로 표시하여 비워둠
			
			
			PreparedStatement prpr = conn.prepareStatement(sql); 
			// 쿼리 내용 준비 - -// preparedstatement를 활용하여 상기 ?변수 처리
			prpr.setString(1, subject);		// 첫번재 ? 자리에 String으로 subject변수를 넣어주기
			prpr.setInt(2, count);			// 두번재 ? 자리에 Int으로 count변수를 넣어주기
			
			
			// 쿼리 실행
			prpr.executeUpdate();
			
			// 사용 완료된 구문들 종료
			prpr.close();
		
			
			// 컨펌mssg 전송
			System.out.println("SQL 업데이트 완료");
			*/
			
			
			//=======================연결한 DB에서 데이터 읽어오기===========================
			String sql = "select * from board";
			PreparedStatement prpr = conn.prepareStatement(sql);
			ResultSet rs = prpr.executeQuery();
			
			while (rs.next()) {
				int n = rs.getInt("no");
				String sub =rs.getString("subject");
				String ctnt =rs.getString("content");
				int cnt = rs.getInt("count");
				String wrt =rs.getString("writer");
				System.out.println();
				
				System.out.printf("%d, %s, %s, %d, %s\n", n, sub, ctnt, cnt, wrt);
			}
			
			conn.close();
			
			System.out.println("SQL 정보 불러오기 완료");
			//----------------------------------------------------------------------------

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
