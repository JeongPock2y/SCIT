package tour.mgr;

import java.util.ArrayList;

import tour.dao.tourDAO;
import tour.vo.TourArea;

public class TourManager {
	
	tourDAO dao = new tourDAO();
	
	/**
	 * �������� ����
	 * @param vo ������ ���� ����
	 * @return ���� ���� ����
	 */
	public boolean insertBook(TourArea vo) {
		int cnt = dao.insertBook(vo);
		
		if(cnt > 0) {
			return true;
		}
		
		return false;
	}
	

	/**
	 * ��ü ���� ��� �б�
	 * @return ���� ���
	 */
	public ArrayList<TourArea> listAll() {
		return dao.listAll();
	}
	
	/**
	 * ��ȣ�� �������� �б�
	 * @param bnum �˻��� ��ȣ
	 * @return ���� ���� 
	 */
	public TourArea getBook(int bnum) {
		return dao.getBook(bnum);
	}

	/**
	 * ��ȣ�� �����ϱ�
	 * @param bnum ������ ��ȣ
	 * @return ���� ���� ����
	 */
	public boolean deleteBook(int bnum) {
		int cnt = dao.deleteBook(bnum);
		
		if(cnt > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * ��ȣ�� ���� ���� �����ϱ�
	 * @param vo ������ ������ ��� ��ü
	 * @return ���� ���� ����
	 */
	public boolean updateBook(TourArea vo) {
		int cnt = dao.updateBook(vo);
		
		if(cnt > 0) {
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * �˻��ϱ�
	 * @param text �˻���
	 * @return �˻� ���
	 */
	public ArrayList<TourArea> searchBook(String text) {
		return dao.searchBook(text);
		
	}
	
	/**
	 * ���ǻ纰 �˻��ϱ�
	 * @return �˻� ���
	 */
	public ArrayList<TourArea> searchPublisher(){
		return dao.searchPublisher();
		
	}
}
