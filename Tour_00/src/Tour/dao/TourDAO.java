package Tour.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import Tour.vo.Castle;
import Tour.vo.Park;
import Tour.vo.TourArea;



public class TourDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	
	/*
	 * public int insertTourarea(TourArea t) { SqlSession session = null; int cnt =
	 * 0;
	 * 
	 * try { session = factory.openSession(); TourMapper mapper =
	 * session.getMapper(TourMapper.class); cnt = mapper.insertTourarea(t);
	 * session.commit(); } catch (Exception e) { e.printStackTrace(); } finally { if
	 * (session != null) session.close(); }
	 * 
	 * return cnt;
	 * 
	 * }
	 */
	
	//�� ����
	public int insertCastle(Castle c) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
			cnt = mapper.insertCastle(c);
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
//
	public int insertPark(Park p) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
			cnt = mapper.insertPark(p);
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

	//�� ��� ���
	public ArrayList<TourArea> listTour() {
		SqlSession session = null;
		ArrayList<TourArea> list = null;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
			ArrayList<TourArea> parkList = mapper.listcaslte();
			ArrayList<TourArea> castleList = mapper.listpark();
			list = parkList;
			for (TourArea tourArea : castleList) {
				list.add(tourArea);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return list;
	}
	
//	
//	public TourArea readBoard(int num) {
//		SqlSession session = null;
//		TourArea board = null;
//		
//		try {
//			session = factory.openSession();
//			TourMapper mapper = session.getMapper(TourMapper.class);
//			mapper.updateHits(num);
//			board = mapper.readBoard(num);		
//			session.commit();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			if (session != null) session.close();
//		}
//		
//		return board;
//	}
//	
	//1���� �ۻ���
	public int deleteTour(String area_name) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
			cnt = mapper.deleteTour(area_name);		//�� ����
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
	
	public int updateTour(TourArea tourarea) {
		
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
			cnt = mapper.updateTour(tourarea);		//�� ����
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
//
//	//�� �˻�
//	public ArrayList<TourArea> searchBoard(String word) {
//		SqlSession session = null;
//		ArrayList<TourArea> list = null;
//		
//		try {
//			session = factory.openSession();
//			TourMapper mapper = session.getMapper(TourMapper.class);
//			
//			list = mapper.searchBoard(word);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			if (session != null) session.close();
//		}
//		
//		return list;
//	}
	
	
	public ArrayList<HashMap<String, Object>> listAll(int num){
		SqlSession session = null;
		ArrayList<HashMap<String, Object>> list = null;
		
		try {
			session = factory.openSession();
			TourMapper mapper = session.getMapper(TourMapper.class);
			list = mapper.listAll(num);
			
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
