package board.mgr;

import java.util.ArrayList;
import java.util.HashMap;

import board.dao.BoardDAO;
import board.vo.Board;

public class BoardManager {
	
	private BoardDAO dao = new BoardDAO();
	
	//글 저장
	public boolean insertBoard(Board board) {
		int cnt = dao.insertBoard(board);
		
		if(cnt > 0) {
			return true;
		}
		
		return false;
	}

	//글 목록
	public ArrayList<Board> listBoard() {
		return dao.listBoard();
	}
	
	//1개의 글 읽고 조회수 증가
	public Board readBoard(int num) {
		return dao.readBoard(num);
	}
	
	//1개의 글삭제
	public boolean deleteBoard(int num) {
		return dao.deleteBoard(num) > 0 ? true : false;
	}

	//글 검색
	public ArrayList<Board> searchBoard(int col,String word) {
		HashMap<String,Object> param = new HashMap<String, Object>();
		param.put("c", col);
		param.put("w",word);
		return dao.searchBoard(param);
	}
}
