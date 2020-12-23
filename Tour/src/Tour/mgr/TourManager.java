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
	}

