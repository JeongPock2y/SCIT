package book.mgr;

import java.util.ArrayList;

import book.dao.BookDAO;
import book.vo.BookVO;

public class BookManager {
	
	BookDAO dao = new BookDAO();
	
	/**
	 * �������� ����
	 * @param vo ������ ���� ����
	 * @return ���� ���� ����
	 */
	public boolean insertBook(BookVO vo) {
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
	public ArrayList<BookVO> listAll() {
		return dao.listAll();
	}
	
	/**
	 * ��ȣ�� �������� �б�
	 * @param bnum �˻��� ��ȣ
	 * @return ���� ���� 
	 */
	public BookVO getBook(int bnum) {
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
	public boolean updateBook(BookVO vo) {
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
	public ArrayList<BookVO> searchBook(String text) {
		return dao.searchBook(text);
		
	}
	
	/**
	 * ���ǻ纰 �˻��ϱ�
	 * @return �˻� ���
	 */
	public ArrayList<BookVO> searchPublisher(){
		return dao.searchPublisher();
		
	}
}
