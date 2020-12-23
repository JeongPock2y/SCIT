package board.mgr;

import java.util.ArrayList;
import java.util.HashMap;

import board.dao.BoardDAO;
import board.vo.Board;

public class BoardManager {
	
	private BoardDAO dao = new BoardDAO();
	
	//�� ����
	public boolean insertBoard(Board board) {
		int cnt = dao.insertBoard(board);
		
		if(cnt > 0) {
			return true;
		}
		
		return false;
	}

	//�� ���
	public ArrayList<Board> listBoard() {
		return dao.listBoard();
	}
	
	//1���� �� �а� ��ȸ�� ����
	public Board readBoard(int num) {
		return dao.readBoard(num);
	}
	
	//1���� �ۻ���
	public boolean deleteBoard(int num) {
		return dao.deleteBoard(num) > 0 ? true : false;
	}

	//�� �˻�
	public ArrayList<Board> searchBoard(int col,String word) {
		HashMap<String,Object> param = new HashMap<String, Object>();
		param.put("c", col);
		param.put("w",word);
		return dao.searchBoard(param);
	}
}
