package tour.dao;

import java.util.ArrayList;

import tour.vo.TourArea;

/**
 * Mapper XML과 매핑되는 인터페이스
 */
public interface TourMapper {

	//도서 정보 저장
	public int insertBook(TourArea vo);
	//전체 도서 목록 읽기
	public ArrayList<TourArea> listAll();
	//번호로 도서정보 읽기
	public TourArea getBook(int bnum);
	//번호로 삭제하기
	public int deleteBook(int bnum);

	//번호로 제목, 저자, 출판사, 가격 수정하기
	public int updateBook(TourArea vo);
	//검색하기
	public ArrayList<TourArea> searchBook(String text);
	//출판사별 검색
	public ArrayList<TourArea> searchPublisher();

	
}
