package tourarea.manager;

import java.util.ArrayList;
import tourarea.vo.Castle;
import tourarea.vo.Park;
import tourarea.vo.TourArea;
import tourarea.vo.jp.Castle_jp;
import tourarea.vo.jp.Park_jp;
import tourarea.vo.jp.TourArea_jp;

public class TourManager implements AbstractTourManager {

	private ArrayList<TourArea> tourareaList;
	private ArrayList<TourArea_jp> tourareaList_jp;

	public TourManager() {
		tourareaList = new ArrayList<TourArea>();
		tourareaList_jp = new ArrayList<TourArea_jp>();
		
	}

	@Override
	public TourArea searchId(String name) {
		for (TourArea tourArea : tourareaList) {
			if (tourArea.getName().equals(name)) {
				return tourArea;
			}
		}
		return null;
	}
	@Override
	public TourArea_jp searchId_jp(String name) {
		for (TourArea_jp tourArea : tourareaList_jp) {
			if (tourArea.getName().equals(name)) {
				return tourArea;
			}
		}
		return null;
	}

	@Override
	public boolean insertTour(TourArea tourarea) {
		if (searchId(tourarea.getName()) != null) {
			return false;
		}
		tourareaList.add(tourarea);
		return true;
	}
	@Override
	public boolean insertTour_jp(TourArea_jp tourarea) {
		if (searchId(tourarea.getName()) != null) {
			return false;
		}
		tourareaList_jp.add(tourarea);
		return true;
	}

	@Override
	public boolean deleteTour(String name) {
		TourArea tourarea = null;
		for (int i = 0; i < tourareaList.size(); i++) {
			tourarea = tourareaList.get(i);
			if (name.equals(tourarea.getName())) {
				tourareaList.remove(i);
				return true;
			}

		}
		return false;
	}
	@Override
	public boolean deleteTour_jp(String name) {
		TourArea_jp tourarea = null;
		for (int i = 0; i < tourareaList_jp.size(); i++) {
			tourarea = tourareaList_jp.get(i);
			if (name.equals(tourarea.getName())) {
				tourareaList_jp.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateTour(TourArea tourarea) {
		TourArea find = null;
		for (int i = 0; i < tourareaList.size(); i++) {
			find= tourareaList.get(i);
			if (tourarea.getName().equals(find.getName())) {
				find.setFee(tourarea.getFee());
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean updateTour_jp(TourArea_jp tourarea) {
		TourArea_jp find = null;
		for (int i = 0; i < tourareaList_jp.size(); i++) {
			find = tourareaList_jp.get(i);
			if (tourarea.getName().equals(find.getName())) {
				find.setFee(tourarea.getFee());
				return true;
			}
		}
		return false;
	}



	@Override
	public ArrayList<TourArea> tourAreaListForType(int type) {
		ArrayList<TourArea> list = new ArrayList<>();
		TourArea tourarea = null;

		for (int i = 0; i < tourareaList.size(); i++) {
			tourarea = tourareaList.get(i);

			if (type == 1) {
				list.add(tourarea);
			} else if (type == 2) {
				if (tourareaList.get(i) instanceof Castle) {
					list.add(tourarea);
				}
			} else if (type == 3) {
				if (tourareaList.get(i) instanceof Park) {
					list.add(tourarea);
				}
			}
		}
		return list;
	}
	@Override
	public ArrayList<TourArea_jp> tourAreaListForType_jp(int type) {
		ArrayList<TourArea_jp> list = new ArrayList<>();
		TourArea_jp tourarea = null;

		for (int i = 0; i < tourareaList_jp.size(); i++) {
			tourarea = tourareaList_jp.get(i);

			if (type == 1) {
				list.add(tourarea);
			} else if (type == 2) {
				if (tourareaList_jp.get(i) instanceof Castle_jp) {
					list.add(tourarea);
				}
			} else if (type == 3) {
				if (tourareaList_jp.get(i) instanceof Park_jp) {
					list.add(tourarea);
				}
			}
		}
		return list;
	}

	@Override
	public ArrayList<TourArea_jp> tourAreaListSubway_jp(int subwayline) {
		ArrayList<TourArea_jp> list = new ArrayList<>();
		TourArea_jp tourarea = null;
		for (int i = 0; i < tourareaList_jp.size(); i++) {
			 tourarea =tourareaList_jp.get(i);
			if (subwayline == tourarea.getSubwayline()) {
				list.add(tourarea);
			}

		}
		return list;
	}
	@Override
	public ArrayList<TourArea> tourAreaListSubway(int subwayline) {
		ArrayList<TourArea> list = new ArrayList<>();
		TourArea tourarea = null;
		for (int i = 0; i < tourareaList.size(); i++) {
			 tourarea =tourareaList.get(i);
			if (subwayline == tourarea.getSubwayline()) {
				list.add(tourarea);
			}

		}
		return list;
	}


}