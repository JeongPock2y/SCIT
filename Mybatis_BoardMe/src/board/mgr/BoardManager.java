package board.mgr;

import java.util.ArrayList;

import board.dao.BoardDAO;
import board.vo.Board;

public class BoardManager {
	
	private BoardDAO dao = new BoardDAO();
	
	//글 저장
	public boolean insertBoard(Board board) {
		int count  = dao.insertBoard(board);
		if (count > 0) {
			return true;
		}
		return false;
	}
	//글 목록
	public ArrayList<Board> listBoard() {
		return dao.listBoard();
	}//글 검색
	public Board readBoard(int boardnum) {
		return dao.readBoard(boardnum);
	}//글삭제
	public boolean deletBoard(int boardnum) {
		int count=dao.deleteBoard(boardnum);
		if (count > 0) {
			return true;
		}else {
			return false;
		}
	}
	//검색하기
	public ArrayList<Board> searchBoard(String word) {
		return dao.searchBoard(word);
	//출판사별 검색
}



}
