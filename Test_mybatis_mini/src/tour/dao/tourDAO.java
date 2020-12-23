package tour.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import tour.vo.TourArea;

/**
 * DB관련 처리 클래스
 */
public class tourDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	
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
	 * 전체 도서 목록 읽기
	 * @return 도서 목록
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
	 * 번호로 도서정보 읽기
	 * @param bnum 검색할 번호
	 * @return 도서 정보 
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
	 * 번호로 삭제하기
	 * @param bnum 삭제할 번호
	 * @return 삭제된 레코드 수
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
	 * 번호로 도서 정보 수정하기
	 * @param vo 수정할 정보가 담긴 객체
	 * @return 수정된 레코드 수
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
	 * 검색하기
	 * @param text 검색어
	 * @return 검색 결과
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
	 * 출판사별 검색하기
	 * @return 검색 결과
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
