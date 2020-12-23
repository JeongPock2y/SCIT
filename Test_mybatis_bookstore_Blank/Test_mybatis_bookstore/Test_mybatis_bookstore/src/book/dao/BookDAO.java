package book.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;



import book.vo.BookVO;

/**
 * DB관련 처리 클래스
 */
public class BookDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	/**
	 * 도서정보 저장
	 * @param vo 저장할 도서 정보
	 * @return 저장된 레코드 수
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
	 * 전체 도서 목록 읽기
	 * @return 도서 목록
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
	 * 번호로 도서정보 읽기
	 * @param bnum 검색할 번호
	 * @return 도서 정보 
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
	 * 번호로 삭제하기
	 * @param bnum 삭제할 번호
	 * @return 삭제된 레코드 수
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
	 * 번호로 도서 정보 수정하기
	 * @param vo 수정할 정보가 담긴 객체
	 * @return 수정된 레코드 수
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
	 * 검색하기
	 * @param text 검색어
	 * @return 검색 결과
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
	 * 출판사별 검색하기
	 * @return 검색 결과
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
