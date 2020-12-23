package board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.vo.Board;

public class BoardDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//�� ����
	public int insertBoard(Board board) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.insertBoard(board);
			session.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return cnt;
	}

	//�� ���
	public ArrayList<Board> listBoard() {
		SqlSession session = null;
		ArrayList<Board> list = null;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			list = mapper.listBoard();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return list;
	}
	
	//1���� �� �а� ��ȸ�� ����
	public Board readBoard(int num) {
		SqlSession session = null;
		Board board = null;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			mapper.updateHits(num);
			board = mapper.readBoard(num);		
			session.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return board;
	}
	
	//1���� �ۻ���
	public int deleteBoard(int num) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.deleteBoard(num);		//�� ����
			session.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		return cnt;
	}

	//�� �˻�
	public ArrayList<Board> searchBoard(HashMap<String, Object> param ) {
		SqlSession session = null;
		ArrayList<Board> list = null;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			list = mapper.searchBoard(param);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return list;
	}
	
}
