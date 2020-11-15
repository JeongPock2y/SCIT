package tourarea.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import tourarea.manager.TourManager;
import tourarea.vo.Palace;
import tourarea.vo.Park;
import tourarea.vo.TourArea;

/**
 * 사용자 인터페이스
 */
public class TourUI {
	Scanner input = new Scanner(System.in);
	TourManager manager = new TourManager();

	/**
	 * 생성자
	 */
	public TourUI() {
		int languageNum = 0;
		int menuNum = 0;
			printlanguageMenu();
			languageNum=input.nextInt();
				// 프로그램 종료시까지 무한 반복
//				while (true) {
//					printMainMenu();
//
//					try {
//						menuNum = input.nextInt();
//						switch (menuNum) {
//						case 1:add();
//							break;
//						case 2:delete();
//							break;
//						case 3:update();
//							break;
//						case 4:search();
//							break;
//						case 0:exit();
//							return;
//						default:
//							System.out.println("[오류] 다시 선택하세요.");
//						}
//					} catch (Exception e) {
//						System.out.println("[오류] 입력형식이 잘못되었습니다.");
//						input.nextLine();
//					}
//				}
//				//일본어
//				if (languageNum == 2) {
//
//				}
//			}
		
	}

	// 첫번째로 출력 언어고르기
	public void printlanguageMenu() {
		System.out.println("***LANGUAGE***");
		System.out.println("*****SELECT*****");
		System.out.println("\t1.KOREA\t");
		System.out.println("\t2.JAPAN\t");
		System.out.print(">>Insert Num>> ");
	}

	public void printMainMenu() {
		System.out.println();
		System.out.println("┌ *관광지에 대해 알아보자!!* ┐");
		System.out.println("│\t1. 관광지 입력\t\t│");
		System.out.println("│\t2. 관광지 검색\t\t│");
		System.out.println("│\t3. 관광지 수정\t\t│");
		System.out.println("│\t4. 관광지 삭제\t\t│");
		System.out.println("└\t0. 프로그램 종료\t\t┘");
		System.out.print("** 번호 선택 > ");
	}

	public void insertMenu() {
		System.out.println("");
	}

	public void add() {

//		switch (num) {
//		case 1:
//			System.out.print("평균 자책 > ");
//			era = input.nextDouble();
//			System.out.print("이닝 > ");
//			inning = input.nextInt();
//			System.out.print("승 > ");
//			wins = input.nextInt();
//			System.out.print("패 > ");
//			losses = input.nextInt();
//			System.out.print("세이브 > ");
//			save = input.nextInt();
//			System.out.print("홀드 > ");
//			hold = input.nextInt();
//
//			player = new Palace(id, name, team, salary, war, era, inning, wins, losses, save, hold);
//			break;
//		case 2:
//			System.out.print("타율 > ");
//			average = input.nextDouble();
//			System.out.print("타수 > ");
//			atbat = input.nextInt();
//			System.out.print("타점 > ");
//			rbi = input.nextInt();
//			System.out.print("득점 > ");
//			score = input.nextInt();
//
//			player = new Park(id, name, team, salary, war, average, atbat, rbi, score);
//			break;
//		}
//	}catch(
//
//	InputMismatchException e)
//	{
//		System.out.println("[오류] 입력형식이 잘못되었습니다.");
//		input.nextLine();
//		return;
//	}
//
//	boolean res = manager.insertPlayer(player);if(res)
//	{
//		System.out.println("[정보] 저장되었습니다.");
//	}else
//	{
//		System.out.println("[정보] 저정 실패했습니다.");
//	}
	}

	public void delete() {
		String id = null;

		System.out.println();
		System.out.println("[ 선수 삭제 ]");
		System.out.print("** 삭제할 선수 번호 > ");
		id = input.next();

		boolean res = manager.deletePlayer(id);
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
		System.out.println("[ 선수 수정 ]");
		System.out.print("** 수정할 선수 번호 > ");
		id = input.next();

		player = manager.searchId(id);
		if (player == null) {
			System.out.println("[오류] 해당 번호의 선수 정보가 없습니다.");
			return;
		}

		try {
			System.out.print("** 수정할 선수 연봉 > ");
			fee = input.nextInt();
		} catch (Exception e) {
			System.out.println("[오류] 입력형식이 잘못되었습니다.");
			input.nextLine();
			return;
		}

		player.setFee(fee);
		boolean res = manager.updatePlayer(player);
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
		ArrayList<TourArea> list = null;

		try {
			System.out.println();
			System.out.println("[ 검색 ]");
			System.out.println("1. 전체");
			System.out.println("2. 투수");
			System.out.println("3. 타자");
			System.out.println("4. 베스트 플레이어");
			System.out.println("5. 연봉 검색");
			System.out.print("** 메뉴 선택 > ");

			num = input.nextInt();

			switch (num) {
			case 1:
			case 2:
			case 3:
				list = manager.tourAreaListForType(num);
				break;
			case 4:
				list = manager.tourAreaListParking();
				break;
		
			case 5:
				list = manager.tourAreaListSubway();
				break;
			case 6:
				System.out.print("최저 연봉 : ");
				min = input.nextInt();
				System.out.print("최고 연봉 : ");
				max = input.nextInt();

				list = manager.tourAreaListForFee(min, max);
				break;
			default:
				System.out.println("[오류] 잘못 선택했습니다.");
				return;
			}
			print(list);
		} catch (InputMismatchException ex) {
			System.out.println("[오류] 입력형식이 잘못되었습니다.");
			input.nextLine();
		}
	}

	// 목록 출력
	public void print(ArrayList<TourArea> list) {
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

	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.out.println("감사합니다.");
		return;
	}

}