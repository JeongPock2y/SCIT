package Tour.mgr;

import java.util.ArrayList;
import java.util.HashMap;

import Tour.vo.Castle;
import Tour.vo.Park;
import Tour.dao.TourDAO;
import Tour.vo.TourArea;

public class TourManager {

	private TourDAO dao = new TourDAO();
	private ArrayList<TourArea> tourareaList;
	/*
	 * public boolean insertTourarea(TourArea t) {
	 * 
	 * int cnt = dao.insertTourarea(t);
	 * 
	 * if (cnt > 0) { return true; }
	 * 
	 * return false; }
	 */

	// 글 저장
	public boolean insertCastle(Castle c) {
		int cnt = dao.insertCastle(c);

		if (cnt > 0) {
			return true;
		}

		return false;
	}

	public boolean insertPark(Park p) {
		int cnt = dao.insertPark(p);

		if (cnt > 0) {
			return true;
		}
		return false;
	} 
	public ArrayList<TourArea> listTour() {
		return dao.listTour();
	}
	public ArrayList<HashMap<String, Object>> listAll(int num)
	{
		return dao.listAll(num);
	
	}             
//	public TourArea readBoard(int num) {
//		return dao.readBoard(num);
//	}
//
	public boolean deleteTour(String area_name) {
		int cnt = dao.deleteTour(area_name);

		if (cnt > 0) {
			return true;
		}

		return false;
	}
	public boolean updateTour(TourArea tourarea) {
		int cnt = dao.updateTour(tourarea);

		if (cnt > 0) {
			return true;
		}

		return false;
		
	}
		
	
	
	// 1개의 글삭제
	/*public boolean deleteTour(String name) {
		TourArea tourarea = null;
		for (int i = 0; i <tourareaList.size() ; i++) {
			tourarea = tourareaList.get(i);
			if (name.equals(tourarea.getarea_name())) {
				tourareaList.remove(i);
				return true;
				}
		
	}return false;
}*/
//
//	// 글 검색
//	public ArrayList<TourArea> searchBoard(String word) {
//		return dao.searchBoard(word);
//	}
		
		

		
	}

