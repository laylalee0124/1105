package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.LoginDTO;
import dto.LoginResponseDTO;
import dto.MembeJoinDTO;
import dto.MemberDTO;
import dto.MemberEditDTO;
import mybatis.MybatisManager;

/*
DB access에 관련된 내용은 DAO에서 처리한다.
1) sqlSessionFactory.openSession(true)으로 SqlSession 타입의 session 변수 생성.
2) DB에서 insert/select/delete/update 하도록 시킬 것이므로 .insert/select/delete/update() 메서드를 사용.
	memberMapper라는 이름의 mapper-mapper에서 insert/select/delete/update라는 이름으로 만들어둔 쿼리문 가져와서 DB에 전달.
	이때 넘겨받은 값 (두번재 parameter) 같이 가져가도록 지정.
3) 세션 종료
*/

public class MemberDAO {
	
	///////////// SqlSessionFactory 를 생성하는 필수 기본 구문 /////////////
	private SqlSessionFactory sqlSessionFactory;
	public MemberDAO() {
		sqlSessionFactory=MybatisManager.getSqlSessionFactory();}
	//////////////////////////////////////////////////////////////////
	
	public LoginResponseDTO login(LoginDTO dto) {
		SqlSession session=sqlSessionFactory.openSession();
		LoginResponseDTO logData=session.selectOne("memberMapper.login", dto); // Login DTO dto(=email,pass)에 담긴정보를 가지고 쿼리문으로 가서 필요한 정보를 얻어와서 해당 정보를 모두 담을수 있는 DTO인 LoginResponseDTO logData에 DB에서 가져온 데이터(no, email, pass)를 저장해줌. 
		session.close();
		return logData; // login()에 logdate를 반환해줌 (no, email, pass)
	}
	
	public MemberDTO memberInfo(int no) {
		SqlSession session=sqlSessionFactory.openSession();
		MemberDTO result=session.selectOne("memberMapper.memberInfo", no);
		session.close();
		return result;
	}

	public void editPass(MemberEditDTO dto) {
		// TODO Auto-generated method stub
		SqlSession session=sqlSessionFactory.openSession(true);
		session.update("memberMapper.memberEdit", dto);
		session.close();
	}

	public void delete(int no) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession(true);
		session.delete("memberMapper.delete", no);
		session.close();
	}

	public void join(MembeJoinDTO dto) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession(true);
		session.insert("memberMapper.join", dto);
		session.close();
	}

	public int emailCheck(String email) {
		// TODO Auto-generated method stub
		SqlSession session = sqlSessionFactory.openSession(true);
		int result=session.selectOne("memberMapper.emailCheck", email);
		session.close();
		return result;
	}
}
