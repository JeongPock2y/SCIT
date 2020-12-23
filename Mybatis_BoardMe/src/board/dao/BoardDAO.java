package board.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.vo.Board;

public class BoardDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü

	// �� ����
	public int insertBoard(Board board) {
		int count =0;
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			count = mapper.insertBoard(board);
			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ss != null) {
				ss.close();
			}
		}

		return count;
	}

	public ArrayList<Board> listBoard() {
		ArrayList<Board> list =null;
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			list = mapper.listBoard();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ss != null) {
				ss.close();
			}
		}

		return list;
	}

	// 1���� �� �а� ��ȸ�� ����
	public Board readBoard(int boardnum) {
		Board board =null;
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			mapper.updateHits(boardnum);
			board = mapper.readBoard(boardnum);
			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ss != null) {
				ss.close();
			}
		}

		return board;
	}
	// 1���� �ۻ���
	public int deleteBoard(int boardnum) {
		int count =0;
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			count = mapper.deleteBoard(boardnum);
			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ss != null) {
				ss.close();
			}
		}

		return count;
	}


	// �� �˻�
	public ArrayList<Board> searchBoard(String word) {
		ArrayList<Board> list = null;
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			BoardMapper mapper = ss.getMapper(BoardMapper.class);
			list = mapper.searchBoard(word);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ss != null) {
				ss.close();
			}
		}

		return list;
	}
	

}
