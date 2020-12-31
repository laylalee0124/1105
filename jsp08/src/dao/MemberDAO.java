package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.LoginDTO;
import dto.LoginResponseDTO;
import dto.MemberDTO;
import mybatis.MybatisManager;

// DB access에 관련된 내용은 DAO에서 처리한다.

public class MemberDAO {
	
	
	private SqlSessionFactory sqlSessionFactory;
	
	public MemberDAO() {
		sqlSessionFactory=MybatisManager.getSqlSessionFactory();
	}
	
	
	public LoginResponseDTO login(LoginDTO dto) {
		SqlSession session=sqlSessionFactory.openSession();
		
		LoginResponseDTO logData=session.selectOne("memberMapper.login", dto);
		
		session.close();
		return logData;
	}
	
	/*
	 * public void insert(MemberRequestDTO dto) { SqlSession
	 * sqlSession=sqlSessionFactory.openSession(); //mapper에게 실행명령 int
	 * n=sqlSession.insert("memberMapper.insert", dto); System.out.println(n);
	 * 
	 * sqlSession.commit(); } public int selectEmail(String email) { SqlSession
	 * sqlSession=sqlSessionFactory.openSession(); int
	 * ea=sqlSession.selectOne("memberMapper.selectEmail", email); return ea; }
	 */
	
	public MemberDTO memberInfo(int no) {
		// sqlSessionFactory를 통해 SqlSession을 생성
		SqlSession session=sqlSessionFactory.openSession();
		
		//mapper에서 memberInfo라는 이름의 쿼리문장 가져와서 서버에 일시키기
		// no라는 값을 넘겨주고 해당 넘버를 통해 가져올 데이터를 추려줌.
		session.selectOne("memberMapper.memberInfo", no);
		
		// 세션 종료
		session.close();
		
		
		
		return null;
	}
}
