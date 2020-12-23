package tour.dao;

import java.util.ArrayList;

import tour.vo.TourArea;

/**
 * Mapper XML�� ���εǴ� �������̽�
 */
public interface TourMapper {

	//���� ���� ����
	public int insertBook(TourArea vo);
	//��ü ���� ��� �б�
	public ArrayList<TourArea> listAll();
	//��ȣ�� �������� �б�
	public TourArea getBook(int bnum);
	//��ȣ�� �����ϱ�
	public int deleteBook(int bnum);

	//��ȣ�� ����, ����, ���ǻ�, ���� �����ϱ�
	public int updateBook(TourArea vo);
	//�˻��ϱ�
	public ArrayList<TourArea> searchBook(String text);
	//���ǻ纰 �˻�
	public ArrayList<TourArea> searchPublisher();

	
}
