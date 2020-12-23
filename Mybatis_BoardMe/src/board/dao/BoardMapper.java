package board.dao;

import java.util.ArrayList;

import board.vo.Board;

/**
 * Mapper XML�� SQL�� ��� �޼���
 */
public interface BoardMapper {

	public int insertBoard(Board board);
	//�� ����

	public ArrayList<Board> listBoard();

	public Board readBoard(int boardnum);
	public int updateHits(int boardnum);

	public int deleteBoard(int boardnum);

	public ArrayList<Board> searchBoard(String word);
}
