package tour.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import tour.vo.TourArea;

/**
 * DB���� ó�� Ŭ����
 */
public class tourDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	
	public int insertBook(TourArea vo) {
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
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
	public ArrayList<TourArea> listAll() {
		SqlSession session = null;
		ArrayList<TourArea> list = null;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
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
	public TourArea getBook(int bnum) {
		SqlSession session = null;
		TourArea vo =null;
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
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
			TourMapper mapper = session.getMapper(TourMapper.class);
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
	public int updateBook(TourArea vo) {
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
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
	public ArrayList<TourArea> searchBook(String text) {
		SqlSession session = null;
		ArrayList<TourArea> list = null;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
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
	public ArrayList<TourArea> searchPublisher(){
		SqlSession session = null;
		ArrayList<TourArea> list = null;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
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
