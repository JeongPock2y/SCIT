package global.sesoc.baseball.ui;

import java.util.ArrayList;
import java.util.Scanner;

import global.sesoc.baseball.manager.BaseballManager;
import global.sesoc.baseball.vo.Batter;
import global.sesoc.baseball.vo.Pitcher;
import global.sesoc.baseball.vo.Player;

/**
 * 사용자 인터페이스
 */
public class BaseballUI {
	Scanner sc = new Scanner(System.in);
	BaseballManager manager = new BaseballManager();
	/**
	 * 생성자
	 */
	public BaseballUI() {
		int menuNum = 0;
		while (true) {
			this.printMainMenu();
			// 프로그램 종료시까지 무한 반복
			try {
				menuNum = sc.nextInt();
				switch (menuNum) {
				case 1:
					add();
					break;
				case 2:
					delete();
					break;
				case 3:
					update();
					break;
				case 4:
					search();
					break;
				case 0:
					exit();
					return;
				default://지정값이아닐때
					System.out.println("[오 류]다시 선택하세요.");
				}
			} catch (Exception e) {
				System.out.println("[오류 ] 입력형식이 잘못되었습니다.");
				sc.nextLine();//강제적으로 enter은 친다고 생각 하기
			}
		}
	}

	/**
	 * 메인 메뉴 출력
	 */
	public void printMainMenu() {
		System.out.println("┌───────────────────────┐");
		System.out.println("│\t[ 야구선수정보관리 ]\t│");
		System.out.println("│1.\t선수정보입럭\t│");
		System.out.println("│2.\t선수정보삭제\t│");
		System.out.println("│3.\t선수정보수정\t│");
		System.out.println("│4.\t검색\t\t│");
		System.out.println("│0.\t프로그램종료\t│");
		System.out.println("└───────────────────────┘");
		System.out.print("* 번호선택 : ");
	}

	/**
	 * 선수 정보 입력
	 */
	public void add() {
		int menuNum = 1;
		sc.nextLine();
		System.out.println("[선수 등록]");
		System.out.println("1. 투수");
		System.out.println("2. 타자");
		System.out.print("** 선수 구분 선택> ");
		int check = sc.nextInt();
		System.out.print("** 선수 고유 번호> ");
		String id = sc.nextLine();
		Player player = manager.searchId(id);
		if (player != null) {
			// 이름 이 있다면 오류 를 내보내는것
			System.out.println("[오류] 이미 존재하는 번호입니다.");
		}
		// 투수
		else if (check == 1) {
			sc.nextLine();
			System.out.print("선수 이름 > ");
			String name = sc.nextLine();
			System.out.print("소속팀 > ");
			String team = sc.nextLine();
			System.out.print("연봉 > ");
			int salary = sc.nextInt();
			System.out.print("WAR > ");
			double war = sc.nextInt();
			System.out.print("평균 자책 > ");
			int era = sc.nextInt();
			System.out.print("이님 > ");
			int inning = sc.nextInt();
			System.out.print("승 > ");
			int wins = sc.nextInt();
			System.out.print("패 > ");
			int losses = sc.nextInt();
			System.out.print("세이브 > ");
			int save = sc.nextInt();
			System.out.print("홀드 > ");
			int hold = sc.nextInt();
			// 타자의플레이어에 넣어줌
			Pitcher pitcher = new Pitcher(id, name, team, salary, war, era, inning, wins, losses, save, hold);
			manager.insertPlayer(pitcher);
			System.out.println("[정보] 저장되었습니다.");

		}

		// 타자
		else if (check == 2) {
			sc.nextLine();
			System.out.print("선수 이름 > ");
			String name = sc.nextLine();
			System.out.print("소속팀 > ");
			String team = sc.nextLine();
			System.out.print("연봉 > ");
			int salary = sc.nextInt();
			System.out.print("WAR > ");
			double war = sc.nextInt();
			System.out.print("타율 > ");
			int average = sc.nextInt();
			System.out.print("타수> ");
			int atbat = sc.nextInt();
			System.out.print("타점 > ");
			int rbi = sc.nextInt();
			System.out.print("득점 > ");
			int score = sc.nextInt();
			// 투수의정보를리스트에 넣어줌
			Batter batter = new Batter(id, name, team, salary, war, average, atbat, rbi, score);
			manager.insertPlayer(batter);
			System.out.println("[정보] 저장되었습니다.");

		}

	}

	/**
	 * 선수 정보 삭제
	 */
	public void delete() {
		int menuNum = 2;
		System.out.println("[선수 삭제]");
		System.out.print("** 삭제할 선수 번호> ");
		String id = sc.nextLine();
		boolean removechecker = manager.deletePlayer(id);
		if (removechecker) {
			System.out.println("[알림] 데이터가 삭제되었습니다.");
		} else {
			System.out.println("[알림] 삭제할 데이터가 없습니다.");
		}
	}

	/**
	 * 선수 정보 수정
	 */
	public void update() {
		int menuNum = 3;
		sc.nextLine();
		System.out.println("[선수 수정]");
		System.out.print("** 수정할 선수 번호 > ");
		String id = sc.nextLine();
		Player player = manager.searchId(id);
		if (player == null) {
			System.out.println("*알림 업데이트할 선수 정보가 없습니다.*");
		} else {

			System.out.print("** 수정할 선수 연봉 >");
			int salary = sc.nextInt();
			player.setSalary(salary);
			boolean boo = manager.updatePlayer(player);
			System.out.println("[정보] 수정되었습니다.");
		}
	}

	/**
	 * 선수 정보 검색
	 */
	public void search() {
		int menuNum = 4;
		int key = 0;
		//데이터를 담아야하니까  선수정보가 1개이상 나올수있으니까
		//원본데이터와같게  그러니가  저기도 어레이리스트 여기도 어레이리스트
		ArrayList<Player> list = null;
		// 4번누르면 그안에 검색텝 안에 전체 투수 타자 등 나와서 입력한값 만나옴
		sc.nextLine();
		System.out.println("[검색]");
		System.out.println("1. 전체");
		System.out.println("2. 투수");
		System.out.println("3. 타자");
		System.out.println("4. 베스트 플레이어");
		System.out.println("5. 연봉 검색");
		System.out.print("** 메뉴 선택  > ");
		key = sc.nextInt();
		switch (key) {
		case 1:
		case 2:
		case 3:
			list=manager.playerListForType(key);
			break;
			//1/2/3/case 모두 같은 거니까  이렇게 줄여서쓸수있음
		case 4:
			manager.bestPlayers();
			break;
		case 5:
			System.out.println("최저 연봉>>>");
			int mins = sc.nextInt();
			System.out.println("최고 연봉>>>");
			int maxs = sc.nextInt();
			manager.playerListForSalary(mins, maxs);
			break;

		}
		print(list);

	}

	// 목록 출력
	public void print(ArrayList<Player> list) {
//print(list);  출력문을 작성해주어야한다.
		System.out.println();
		
		if (list == null || list.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("총 " + list.size() + "건의 검색 결과가 있습니다.");
	}
	

	/**
	 * 프로그램 종료
	 */
	public void exit() {
		int menuNum = 0;
		System.out.println("프로그램을 종료합니다.ㅂㅂ");
		System.exit(0);
		return;
	}

}
