package board.dao;

import java.util.ArrayList;

import board.vo.Board;

/**
 * Mapper XML의 SQL문 사용 메서드
 */
public interface BoardMapper {

	public int insertBoard(Board board);
	//글 저장

	public ArrayList<Board> listBoard();

	public Board readBoard(int boardnum);
	public int updateHits(int boardnum);

	public int deleteBoard(int boardnum);

	public ArrayList<Board> searchBoard(String word);
}
