package tourarea.manager;

import java.util.ArrayList;

import tourarea.vo.Palace;
import tourarea.vo.Park;
import tourarea.vo.TourArea;

public class TourManager implements AbstractTourManager {
	
	private ArrayList<TourArea> tourareaList;
	
	
	public TourManager () {
			tourareaList = new ArrayList<TourArea>();
	}
	
	@Override
	public TourArea searchId(String name) {
		for (TourArea tourArea : tourareaList) {
			if(tourArea.getName().equals(name)) {
				return tourArea;
			}
		}
		return null;
	}

	@Override
	public boolean insertPlayer(TourArea tourarea) {
		if (searchId(tourarea.getName()) != null) {
			return false;
		}
		tourareaList.add(tourarea);
		return true;
	}
	@Override
	public boolean deletePlayer(String id) {
		TourArea tourarea = null;
		for (int i = 0; i < tourareaList.size(); i++) {
			tourarea = tourareaList.get(i);
			if (id.equals(tourarea.getName())) {
				tourareaList.remove(i);
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean updatePlayer(TourArea tourarea) {
		TourArea findPlayer = null;
		for (int i = 0; i < tourareaList.size(); i++) {
			findPlayer = tourareaList.get(i);
			if (tourarea.getName().equals(findPlayer.getName())) {
				findPlayer.setFee(tourarea.getFee());
				return true;
			}
		}
		return false;
	}
//
//	@Override
//	public ArrayList<TourArea> playerListForSalary(int minSalary, int maxSalary) {
//		ArrayList<TourArea> list = new ArrayList<>();
//		TourArea player = null;
//		
//		for (int i = 0; i < playerList.size(); i++) {
//			player = playerList.get(i);
//			if (minSalary <= player.getSalary() && player.getSalary() <= maxSalary) {
//				list.add(player);
//			}
//		}
//		return list;
//	}
//
//	@Override
//	public ArrayList<TourArea> bestPlayers() {
//		ArrayList<TourArea> list = new ArrayList<>();
//		TourArea player = null;
//		TourArea player1 = null;
//		int cnt;
//		
//		for (int i = 0; i < playerList.size(); i++) {
//			player = playerList.get(i);
//			
//			cnt = 0;
//			for (int j = 0; j < playerList.size(); j++) {
//				player1=  playerList.get(j);
//				if (player.getWar() < player1.getWar()) {
//					cnt++;
//				}
//			}
//			if (cnt == 0) list.add(player);
//		}
//		return list;
//	}
	//case4
	@Override
	public ArrayList<TourArea> tourAreaListParking() {
		// TODO Auto-generated method stub
		return null;
	}
	
//5
	@Override
	public ArrayList<TourArea> tourAreaListSubway() {
		// TODO Auto-generated method stub
		return null;
	}
//6
	@Override
	public ArrayList<TourArea> tourAreaListForFee(int minSalary, int maxSalary) {
		// TODO Auto-generated method stub
		return null;
	}
	


	@Override
	public ArrayList<TourArea> tourAreaListForType(int type) {
		ArrayList<TourArea> list = new ArrayList<>();
		TourArea tourarea = null;
		
		for (int i = 0; i < tourareaList.size(); i++) {
			tourarea = tourareaList.get(i);
			
			if (type == 1) {
				list.add(tourarea);
			}
			else if (type == 2) {
				if (tourareaList.get(i) instanceof Palace) {
					list.add(tourarea);
				}
			}
			else if (type == 3) {
				if (tourareaList.get(i) instanceof Park) {
					list.add(tourarea);
				}
			}
		}
		return list;
	}

}