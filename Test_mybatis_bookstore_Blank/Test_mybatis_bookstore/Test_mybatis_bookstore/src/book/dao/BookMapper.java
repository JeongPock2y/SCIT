package book.dao;

import java.util.ArrayList;


import book.vo.BookVO;

/**
 * Mapper XML�� ���εǴ� �������̽�
 */
public interface BookMapper {

	//���� ���� ����
	public int insertBook(BookVO vo);
	//��ü ���� ��� �б�
	public ArrayList<BookVO> listAll();
	//��ȣ�� �������� �б�
	public BookVO getBook(int bnum);
	//��ȣ�� �����ϱ�
	public int deleteBook(int bnum);

	//��ȣ�� ����, ����, ���ǻ�, ���� �����ϱ�
	public int updateBook(BookVO vo);
	//�˻��ϱ�
	public ArrayList<BookVO> searchBook(String text);
	//���ǻ纰 �˻�
	public ArrayList<BookVO> searchPublisher();

	
}
