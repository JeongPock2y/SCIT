package Tour.dao;

import java.util.ArrayList;
import java.util.HashMap;

import Tour.vo.Castle;
import Tour.vo.Park;
import Tour.vo.TourArea;



/**
 * Mapper XML의 SQL문 사용 메서드
 */
public interface TourMapper {
	//글 저장
	public int insertTourarea(TourArea t);
	public int insertCastle(Castle c);
	public int insertPark(Park  p);
	//글 목록 	
	public ArrayList<TourArea> listcaslte();
	public ArrayList<TourArea> listpark();
	public ArrayList<HashMap<String, Object>> listAll(int num);
	//글 읽기

	//수정
	public int updateTour(TourArea tourarea);
	//글 삭제
	public int deleteTour(String area_name);
	//글 검색	
	public ArrayList<TourArea> searchBoard(String word);
}
