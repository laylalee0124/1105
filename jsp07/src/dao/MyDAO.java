package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.LogRequestDTO;
import dto.LogResponseDTO;
import dto.MemberRequestDTO;
import mybatis.MybatisManager;

public class MyDAO {
	private SqlSessionFactory sqlSessionFactory;
	public MyDAO() {
		sqlSessionFactory=MybatisManager.getInstance();
	}
	public void insert(MemberRequestDTO dto) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		//mapper에게 실행명령
		int n=sqlSession.insert("memberMapper.insert", dto);
		System.out.println(n);
		
		sqlSession.commit();
	}
	public int selectEmail(String email) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		int ea=sqlSession.selectOne("memberMapper.selectEmail", email);
		return ea;
	}
	public LogResponseDTO login(LogRequestDTO dto) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		LogResponseDTO logData=sqlSession.selectOne("memberMapper.selectLog", dto);
		return logData;
	}
	

}
