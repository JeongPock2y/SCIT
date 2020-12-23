package Tour.dao;

import java.util.ArrayList;
import java.util.HashMap;

import Tour.vo.Castle;
import Tour.vo.Park;
import Tour.vo.TourArea;



public interface TourMapper {
	//����
	public int insertTourarea(TourArea t);
	public int insertCastle(Castle c);
	public int insertPark(Park  p);
	// ��� 	
	public ArrayList<TourArea> listcaslte();
	public ArrayList<TourArea> listpark();
	public ArrayList<HashMap<String, Object>> listAll(int num);
	

	//����
	public int updateTour(TourArea tourarea);
	// ����
	public int deleteTour(String area_name);


}
