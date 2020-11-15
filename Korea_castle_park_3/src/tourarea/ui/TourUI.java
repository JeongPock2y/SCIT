package tourarea.ui;

import java.util.ArrayList;

import java.util.Scanner;
import tourarea.manager.TourManager;
import tourarea.vo.Castle;
import tourarea.vo.Park;
import tourarea.vo.TourArea;

/**
 * 사용자 인터페이스
 */
public class TourUI {
	Scanner sc = new Scanner(System.in);
	TourManager manager = new TourManager();

	/**
	 * 생성자
	 */
	public TourUI() {
	
		int menuNum = 0;
			
			while (true) {
				printMainMenu();
				try {
					menuNum = sc.nextInt();
					switch (menuNum) {
					case 1:
						add();
						break;
					case 2:
						search();
						break;
					case 3:
						delete();
						break;
					case 4:
						update();
						break;
					case 0:
						exit();
						return;
					default:
						System.out.println("[오류] 다시 선택하세요.");
					}
				} catch (Exception e) {
					System.out.println("[오류] 입력형식이 잘못되었습니다.");
					sc.nextLine();
				}
			}
		}

	



	public void printMainMenu() {
		System.out.println();
		System.out.println("  *관광지에 대해 알아보자!!* ");
		System.out.println("│\t1. 관광지 입력\t\t│");
		System.out.println("│\t2. 관광지 검색\t\t│");
		System.out.println("│\t3. 관광지 삭제\t\t│");
		System.out.println("│\t4. 관광지 수정\t\t│");
		System.out.println("└\t0. 프로그램 종료\t\t┘");
		System.out.print("** 번호 선택 > ");
	}
	public void add() {
		TourArea tourarea = null;
		System.out.println();
		System.out.println("--관광지 종류---");
		System.out.println("1. 궁");
		System.out.println("2. 공원");
		System.out.print("등록할 타입을 골라주세요>>");
		int inum=sc.nextInt();
		sc.nextLine();
		System.out.print("이름을 입력>>>");
		String name = sc.nextLine();
		System.out.print("입장료을 입력>>>");
		int fee = sc.nextInt();
		System.out.print("영업시작시간을 입력>>>");
		int starttime = sc.nextInt();
		System.out.print("영업 종료시간을 입력>>>");
		int closetime = sc.nextInt();
		System.out.print("지하철 노선을 입력(1-3호선)>>>");
		int subwayline = sc.nextInt();
		System.out.print("주차 유무(Y/N)>>>");
		boolean parking = false;
		String pk = null;
		pk=sc.nextLine();
		if(pk.equals("Y")) {
			parking =true;
		}else {
			parking = false;
		}
		switch(inum){
		case 1 : 
			sc.nextLine();
			System.out.print("지어진 연(년)도>>>");
			int birth =sc.nextInt();
			sc.nextLine();
			System.out.print("사용한 시대의 왕이름>>>");
			String king = sc.nextLine();
			tourarea = new Castle(name, fee, starttime, closetime, subwayline, parking, birth, king);
			manager.insertTour(tourarea);
			System.out.println("궁(성)의 정보가 저장되었음");
			break;
		case 2 :
			sc.nextLine();
			System.out.print("위치(주소)를 입력해 주세요>>");
			String location = sc.nextLine();
			System.out.print("공원내 관리실의 개수를 입력해주세요>>> ");
			int manageoffice = sc.nextInt();
			tourarea = new Park(name, fee, starttime, closetime, subwayline, parking, location, manageoffice);
			manager.insertTour(tourarea);
			System.out.println("공원의 정보가 저장되었습니다.");
			break;
			}
		}
	public void delete() {
		String id = null;
		System.out.println();
		System.out.println("[ 관광지 정보 삭제 ]");
		System.out.print("** 삭제할 장소 이름 > ");
		id = sc.next();
		boolean res = manager.deleteTour(id);
		if (res) {
			System.out.println("[정보] 삭제되었습니다.");
		} else {
			System.out.println("[정보] 삭제 대상이 존재하지 않습니다.");
		}
	}
	public void update() {
		TourArea player = null;
		String id = null;
		int fee = 0;

		System.out.println();
		System.out.println("[ 관광지 장소 수정 ]");
		System.out.print("** 수정할 장소 이름 > ");
		id = sc.next();
		player = manager.searchId(id);
		if (player == null) {
			System.out.println("[오류] 해당 번호의  장소가 없습니다.");
			return;
		}

		try {
			sc.nextLine();
			System.out.print("** 수정할 장소 입력 > ");
			id = sc.nextLine();
			System.out.print("** 수정할 입장료 입력 > ");
			fee = sc.nextInt();
		} catch (Exception e) {
			System.out.println("[오류] 입력형식이 잘못되었습니다.");
			sc.nextLine();
			return;
		}
		player.setName(id);
		player.setFee(fee);
		boolean res = manager.updateTour(player);
		if (res) {
			System.out.println("[정보] 수정되었습니다.");
		} else {
			System.out.println("[정보] 수정 실패했습니다.");
		}
	}
	public void search() {
		int num = 0;
		int min = 0;
		int max = 0;
		int subwayline=0;
		ArrayList<TourArea> list = null;
		TourArea tourarea =null;
		try {
			System.out.println();
			System.out.println("[ 검색 ]");
			System.out.println("1. 전체");
			System.out.println("2. 궁(성)");
			System.out.println("3. 공원");
			System.out.println("4. 지하철 노선별 검색(1-3호선)");
			System.out.println("5. 성(이름으로 검색)");
			System.out.println("6. 공원(이름으로 검색)");
			System.out.println("7. 상위매뉴");
			System.out.print("** 메뉴 선택 >> ");
			num = sc.nextInt();
			switch (num) {
			case 1:
			case 2:
			case 3:
				list = manager.tourAreaListForType(num);
				break;
			case 4:
				System.out.print("검색할 노선의 번호를 입력해주세요 : ");
				subwayline = sc.nextInt();
				list = manager.tourAreaListSubway(subwayline);
				break;
			case 5 ://성
				sc.nextLine();
				System.out.print("찾을 궁(성)의 이름을 입력해주세요 : ");
				String Cname = sc.nextLine();
				tourarea = manager.searchId(Cname);
				System.out.println(tourarea);
				break;
			case 6 ://공원
				sc.nextLine();
				System.out.print("찾을 공원이름을 입력해주세요 : ");
				String Pname = sc.nextLine();
				tourarea = manager.searchId(Pname);
				System.out.println(tourarea);
				break;
			case 7:
				return;
			default:
				System.out.println("[오류] 잘못 선택했습니다.");
				return;
			}
			print(list);
		} catch (Exception e) {
			System.out.println("[오류] 입력형식이 잘못되었습니다.");
			sc.nextLine();
		}
	}

	// 목록 출력
	public void print(ArrayList<TourArea> list) {
		System.out.println();
		if (list == null || list.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		for (TourArea tourarea : list) {
			System.out.println(tourarea);
		}
		System.out.println("총 " + list.size() + "건의 검색 결과가 있습니다.");
	}
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.out.println("감사합니다.");
		return;
	}

}