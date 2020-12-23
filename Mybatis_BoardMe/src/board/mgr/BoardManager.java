package board.mgr;

import java.util.ArrayList;

import board.dao.BoardDAO;
import board.vo.Board;

public class BoardManager {
	
	private BoardDAO dao = new BoardDAO();
	
	//�� ����
	public boolean insertBoard(Board board) {
		int count  = dao.insertBoard(board);
		if (count > 0) {
			return true;
		}
		return false;
	}
	//�� ���
	public ArrayList<Board> listBoard() {
		return dao.listBoard();
	}//�� �˻�
	public Board readBoard(int boardnum) {
		return dao.readBoard(boardnum);
	}//�ۻ���
	public boolean deletBoard(int boardnum) {
		int count=dao.deleteBoard(boardnum);
		if (count > 0) {
			return true;
		}else {
			return false;
		}
	}
	//�˻��ϱ�
	public ArrayList<Board> searchBoard(String word) {
		return dao.searchBoard(word);
	//���ǻ纰 �˻�
}



}
