package global.sesoc.baseball.manager;

import java.util.ArrayList;

import global.sesoc.baseball.dao.BaseBallDAO;
import global.sesoc.baseball.vo.Batter;
import global.sesoc.baseball.vo.Pitcher;
import global.sesoc.baseball.vo.Player;

/**
 * 데이터의 처리를 담당
 */
public class BaseballManager implements AbstractBaseballManager {
	/**
	 * 선수 정보를 저장할 리스트  111111111111
	 */
	// private ArrayList<Player> playerList;
	private BaseBallDAO baseBallDAO;

	/**
	 * 생성자
	 */
	public BaseballManager() {
		// 기존 저장된 파일이 있으면 열어서 읽는다.
		// 저장된 파일이 없으면 새로운 리스트를 생성한다
		// playerList = new ArrayList<Player>();
		baseBallDAO = new BaseBallDAO();
	}

	
	/*
	 * @Parameter : 0001
	 * 
	 * 
	 */
	@Override
	public Player searchId(String id) {

//		for (int i = 0; i < playerList.size(); i++) {
//			if (playerList.get(i).getName().equals(id)) {
//				return playerList.get(i);
//			}
//		}
		id = "BB-"+id;
		//id = "BB-0001"
		return baseBallDAO.searchId(id);
	}

	// 이름을 플레이어리스트게에저장
	@Override
	public boolean insertPlayer(Player player) {
		// return playerList.add(player);
		return baseBallDAO.insertPlayer(player);
	}

	@Override
	public boolean deletePlayer(String id) {
		boolean checkremove = false;
		for (Player player : playerList) {
			if (player.getName().equals(id)) {
				playerList.remove(player);
				checkremove = true;
			}
		}
		return checkremove;
	}

	@Override
	public boolean updatePlayer(Player player) {
		boolean updatecheck = false;
		for (int i = 0; i < playerList.size(); i++) {
			playerList.set(i, player);
			updatecheck = true;
		}
		return updatecheck;
	}

	@Override
	public ArrayList<Player> playerListForSalary(int minSalary, int maxSalary) {
		ArrayList<Player> list = new ArrayList<>();
		Player player = null;

		for (int i = 0; i < playerList.size(); i++) {
			player = playerList.get(i);
			if (minSalary <= player.getSalary() && player.getSalary() <= maxSalary) {
				list.add(player);
			}
		}
		return list;
	}

	@Override
	public ArrayList<Player> bestPlayers() {
		ArrayList<Player> list = new ArrayList<>();
		Player player = null;
		int cnt;

		for (int i = 0; i < playerList.size(); i++) {
			player = playerList.get(i);
			cnt = 0;
			for (int j = 0; j < playerList.size(); j++) {
				if (player.getWar() < playerList.get(j).getWar()) {
					cnt++;
				}
			}
			if (cnt == 0)
				list.add(player);
		}
		return list;
		// (0.0)(0.1)(0.2)(0.3)(0.4) --->(1.0)(1.1)(1.2)----으로 비교해서 제일큰거 산풀
	}

	@Override
	public ArrayList<Player> playerListForType(int type) {
		ArrayList<Player> tlist = new ArrayList<>();
		if (type == 1) {
			tlist = this.playerList;
		} else if (type == 2) {
			for (Player player : tlist) {
				if (player instanceof Pitcher) {
					tlist.add(player);
				}
			}
		} else if (type == 3) {
			for (Player player : tlist) {
				if (player instanceof Batter) {
					tlist.add(player);
				}
			}

		}
		return tlist;
	}
}
