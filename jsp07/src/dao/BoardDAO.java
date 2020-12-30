package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.BoardEditDTO;
import dto.BoardEntity;
import dto.BoardRequestDTO;
import mybatis.MybatisManager;

public class BoardDAO {
	
	private SqlSessionFactory sqlSessionFactory;
	
	public BoardDAO() {
		sqlSessionFactory=MybatisManager.getInstance();
	}

	public List<BoardEntity> listAll() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		List<BoardEntity> list=sqlSession.selectList("boardMapper.listAll");
		
		sqlSession.close();
		
		return list;
	}

	public void insert(BoardRequestDTO dto) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		sqlSession.insert("boardMapper.insert", dto);
		sqlSession.commit();
		
		sqlSession.close();
		
	}

	public BoardEntity detail(int no) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		BoardEntity entity=sqlSession.selectOne("boardMapper.detail", no);
		
		sqlSession.close();
		
		return entity;
	}

	public void edit(BoardEditDTO dto) {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		
		sqlSession.update("boardMapper.edit", dto);
		
		sqlSession.close();
	}
}
