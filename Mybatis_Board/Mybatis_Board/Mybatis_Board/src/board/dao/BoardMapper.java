package board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import board.vo.Board;

/**
 * Mapper XML�� SQL�� ��� �޼���
 */
public interface BoardMapper {
	//�� ����
	public int insertBoard(Board board);
	//�� ��� 	
	public ArrayList<Board> listBoard();
	//�� �б�
	public Board readBoard(int boardnum);
	//���� ��ȸ�� ����
	public int updateHits(int boardnum);
	//�� ����
	public int deleteBoard(int boardnum);
	//�� �˻�	
	public ArrayList<Board> searchBoard(HashMap<String, Object> param);
}
