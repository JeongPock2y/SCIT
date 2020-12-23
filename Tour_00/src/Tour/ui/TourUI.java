package Tour.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Tour.mgr.TourManager;
import Tour.vo.Castle;
import Tour.vo.Park;
import Tour.vo.TourArea;

/**
 * 게시판 프로그램의 사용자 화면
 */
public class TourUI {
	// static int languageNum = 0;
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
				case 1:add();break;
				case 2:read();break;
				case 3:delete();break;
				case 4:update();break;
				case 0:System.out.println("이용해주셔서 감사합니다.");
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



	/**
	 * 메인 메뉴를 출력한다.
	 */
	public void printMainMenu() {

		System.out.println();
		System.out.println("  *관광지에 대해 알아보자!!* ");
		System.out.println("│\t1. 관광지 입력\t\t│");
		System.out.println("│\t2. 관광지 출력\t\t│");
		System.out.println("│\t3. 관광지 삭제\t\t│");
		System.out.println("│\t4. 관광지 수정\t\t│");
		System.out.println("└\t0. 프로그램 종료\t\t┘");
		System.out.print("** 번호 선택 > ");
	}

	public void add() {
		Castle c=null;
		System.out.println();
		System.out.println("--관광지 종류---");
		System.out.println("1. 궁");
		System.out.println("2. 공원");
		System.out.print("등록할 타입을 골라주세요>>");
		int inum = sc.nextInt();
		switch (inum) {
		case 1:
			sc.nextLine();
			System.out.print("이름을 입력>>>");
			String area_name = sc.nextLine();
			System.out.print("입장료을 입력>>>");
			int fee = sc.nextInt();
			System.out.print("영업시작시간을 입력>>>");
			int starttime = sc.nextInt();
			System.out.print("영업 종료시간을 입력>>>");
			int closetime = sc.nextInt();
			System.out.print("지하철 노선을 입력(1-3호선)>>>");
			int subwayLine = sc.nextInt();
			System.out.print("지어진 연(년)도>>>");
			int birth = sc.nextInt();
			sc.nextLine();
			System.out.print("사용한 시대의 왕이름>>>"); 
			String king = sc.nextLine();
			 c = new Castle(area_name, fee, starttime, closetime, subwayLine, birth, king);
		 
	boolean InsertCastle = manager.insertCastle(c);
	if (InsertCastle) {
		System.out.println("저장 성공");
	}else {
		System.out.println("저장 실패");
	}
	break;
case 2:
	Park p =new Park();
	sc.nextLine();
	System.out.print("이름을 입력>>>");
	area_name = sc.nextLine();
	//p.setarea_name(sc.nextLine());
	System.out.print("입장료을 입력>>>");
	fee = sc.nextInt();
	//p.setFee(sc.nextInt());
	System.out.print("영업시작시간을 입력>>>");
	starttime = sc.nextInt();
	//p.setStarttime(sc.nextInt());
	System.out.print("영업 종료시간을 입력>>>");
	closetime = sc.nextInt();
	//p.setClosetime(sc.nextInt());
	System.out.print("지하철 노선을 입력(1-3호선)>>>");
	subwayLine = sc.nextInt();
	//p.setSubwayLine(sc.nextInt());
	sc.nextLine();
	System.out.print("위치(주소)를 입력해 주세요>>"); 
	String location = sc.nextLine();
	//p.setLocation(sc.nextLine());
	System.out.print("공원내 관리실의 개수를 입력해주세요>>> ");
	int manageOffice = sc.nextInt();
	//p.setManageoffice(sc.nextInt());
	p= new Park(area_name, fee, starttime, closetime, subwayLine, location, manageOffice);
	
			
	   
	  boolean InsertPark =manager.insertPark(p);
	  if (InsertPark) {
		System.out.println(" 성공");
	}else {
		System.out.println("실패");
	}
	 
			break;
	
		default:
			System.out.println("kjfdsklfj");
			break;
		}

}
	public void read() {
		System.out.println("정보 출력(1.castel//2.park)");
		int num = sc.nextInt();
		ArrayList<HashMap<String, Object>> list = manager.listAll(num);
		
		for(HashMap<String, Object> map : list) {
			System.out.print("이름 :"+map.get("AREA_NAME")+"\t");
			System.out.print("요금 :"+map.get("FEE")+"\t");
			System.out.print("시작 :"+map.get("STARTTIME")+"\t");
			System.out.print("끝 :"+map.get("CLOSETIME")+"\t");
			if (num==1) {
				System.out.print("설립 :"+map.get("BIRTH")+"\t");
				System.out.println("왕 :"+map.get("KING")+"\t");
			}else if (num==2 ) {
				System.out.print("장소 :"+map.get("LOCATION")+"\t");
				System.out.println("관리실 :"+map.get("MANAGEOFFICE")+"\t");
				
			}
		}
	}
		

	void delete() {
		String area_name = null;
		sc.nextLine();
		System.out.println();
		System.out.println("[ 관광지 정보 삭제 ]");
		System.out.print("** 삭제할 장소 이름 > ");
		area_name = sc.nextLine();
		boolean res = manager.deleteTour(area_name);
		if (res) {
			System.out.println("[정보] 삭제되었습니다.");
		} else {
			System.out.println("[정보] 삭제 대상이 존재하지 않습니다.");
		}
	}
	
	public void update() {
		sc.nextLine();
		
		System.out.println("[ 관광지 정보 수정 ]");
		System.out.print("** 수정할 장소 이름 > ");
		String area_name  = sc.nextLine();
		
		System.out.println("수정할 요금 >");
		int fee = sc.nextInt();
		System.out.println("수정할 시작 시간> ");
		int starttime = sc.nextInt();
		System.out.println("수정할 종료 시간>");
		int closetime = sc.nextInt();
		System.out.println("수정할 지하철 노선>");
		int subwayLine = sc.nextInt();
		TourArea tourarea = new TourArea(area_name, fee, starttime, closetime, subwayLine);
		boolean res = manager.updateTour(tourarea);
		if (res) {
			System.out.println("[정보] 성공");
		} else {
			System.out.println("[정보] ㅂ2ㅂ2");
		}
	}

}
