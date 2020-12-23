package book.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;



import book.vo.BookVO;

/**
 * DB���� ó�� Ŭ����
 */
public class BookDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	/**
	 * �������� ����
	 * @param vo ������ ���� ����
	 * @return ����� ���ڵ� ��
	 */
	public int insertBook(BookVO vo) {
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			cnt = mapper.insertBook(vo);
			session.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return cnt;
	}
	

	/**
	 * ��ü ���� ��� �б�
	 * @return ���� ���
	 */
	public ArrayList<BookVO> listAll() {
		SqlSession session = null;
		ArrayList<BookVO> list = null;
		
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			list = mapper.listAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return list;
	}

	
	/**
	 * ��ȣ�� �������� �б�
	 * @param bnum �˻��� ��ȣ
	 * @return ���� ���� 
	 */
	public BookVO getBook(int bnum) {
		SqlSession session = null;
		BookVO vo =null;
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			vo = mapper.getBook(bnum);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return vo;
	}
	

	/**
	 * ��ȣ�� �����ϱ�
	 * @param bnum ������ ��ȣ
	 * @return ������ ���ڵ� ��
	 */
	public int deleteBook(int bnum) {
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			cnt = mapper.deleteBook(bnum);
			session.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return cnt;
	}
	
	/**
	 * ��ȣ�� ���� ���� �����ϱ�
	 * @param vo ������ ������ ��� ��ü
	 * @return ������ ���ڵ� ��
	 */
	public int updateBook(BookVO vo) {
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			cnt = mapper.updateBook(vo);
			session.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return cnt;
	}


	
	
	
	
	/**
	 * �˻��ϱ�
	 * @param text �˻���
	 * @return �˻� ���
	 */
	public ArrayList<BookVO> searchBook(String text) {
		SqlSession session = null;
		ArrayList<BookVO> list = null;
		
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			list = mapper.searchBook(text);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return list;
	}
	
	/**
	 * ���ǻ纰 �˻��ϱ�
	 * @return �˻� ���
	 */
	public ArrayList<BookVO> searchPublisher(){
		SqlSession session = null;
		ArrayList<BookVO> list = null;
		
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			list = mapper.searchPublisher();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return list;
	}
	

}
