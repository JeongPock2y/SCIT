package global.sesoc.manager;

import java.util.ArrayList;
import global.sesoc.vo.Bicycle;
import global.sesoc.vo.Drone;
import global.sesoc.vo.GameConsole;
import global.sesoc.vo.Toy;

public class ToyManagerMgr implements ToyManager{
	private ArrayList<Toy> toyList;			// 각종 Toy 정보를 담을 리스트

	/** 
	 * 생성자 
	 */
	public ToyManagerMgr() {
		//새로운 리스트를 생성한다.
		toyList= new ArrayList<Toy>();
	}

	@Override
	public Toy searchToy(String serialNum) {
		for (Toy toy : toyList) {
			if (serialNum.equals(toy.getSerialNum())) {
				return toy;
			}
		}
		return null;
	}
	@Override
	public boolean insertToy(Toy toy) {
		if (searchToy(toy.getSerialNum()) != null) {
			return false;
		}
		toyList.add(toy);
		return true;
	}

	@Override
	public boolean deleteToy(String serialNum) {
		Toy toy = null;
		for (int i = 0; i < toyList.size(); i++) {
			toy = toyList.get(i);
			if (serialNum.equals(toy.getSerialNum())) {
				toyList.remove(i);
				return true;
			}
			
		}
		return false;
	}	
	//가격대 검색
	@Override
	public ArrayList<Toy> toyListForPrice(int minPrice, int maxPrice) {
		ArrayList<Toy> tlist = new ArrayList<>();
		Toy toy = null;
		
		for (int i = 0; i < tlist.size(); i++) {
			toy = tlist.get(i);
			if (minPrice <= toy.getPrice() && toy.getPrice() <= maxPrice) {
				tlist.add(toy);
			}
		}
		return tlist;
	}

	@Override
	public ArrayList<Toy> printToyInfo(int type) {
		ArrayList<Toy> list = new ArrayList<>();
		Toy toy = null;
//		for (int i = 0; i < list.size(); i++) {
//			toy = list.get(i);
//			
//			if (type == 1) {
//				list.add(toy);
//			}
//			else if (type == 2) {
//				if (toy instanceof Bicycle) {
//					list.add(toy);
//				}
//			}
//			else if (type == 3) {
//				if (toy instanceof Drone) {
//					list.add(toy);
//				}
//			}
//			else if (type == 4) {
//				if (toy instanceof GameConsole) {
//					list.add(toy);
//				}
//			}
//	}
		return list;


	}
}

