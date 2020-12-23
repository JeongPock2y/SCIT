package Tour.dao;

import java.util.ArrayList;
import java.util.HashMap;

import Tour.vo.Castle;
import Tour.vo.Park;
import Tour.vo.TourArea;



public interface TourMapper {
	//저장
	public int insertTourarea(TourArea t);
	public int insertCastle(Castle c);
	public int insertPark(Park  p);
	// 목록 	
	public ArrayList<TourArea> listcaslte();
	public ArrayList<TourArea> listpark();
	public ArrayList<HashMap<String, Object>> listAll(int num);
	

	//수정
	public int updateTour(TourArea tourarea);
	// 삭제
	public int deleteTour(String area_name);


}
