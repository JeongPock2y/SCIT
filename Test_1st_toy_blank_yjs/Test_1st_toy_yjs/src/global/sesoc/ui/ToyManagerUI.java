package global.sesoc.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import global.sesoc.manager.ToyManagerMgr;
import global.sesoc.vo.Bicycle;
import global.sesoc.vo.Drone;
import global.sesoc.vo.GameConsole;
import global.sesoc.vo.Toy;

/**
 * 사용자 인터페이스
 */
public class ToyManagerUI {
	Scanner sc = new Scanner(System.in);
	ToyManagerMgr manager = new ToyManagerMgr();

	/**
	 * 생성자
	 */
	public ToyManagerUI() {
		int mNum = 0;

		while (true) {
			try {
				this.mainMenu();
				mNum = sc.nextInt();
				switch (mNum) {
				case 1:
					insertToy();
					break;
				case 2:
					searchToy();
					break;
				case 3:
					deleteToy();
					break;
				case 4:
					searchForPrice();
					break;
				case 5:
					printToyInfo();
					break;
				case 9:
					System.out.println("ㅂㅂ끈다.");
					return;
				default:
					System.out.println(">>>>>>다시 입력해주세요");
					break;
				}

			} catch (Exception e) {
				System.out.println(">>>>>>입력 형식Miss");
				sc.nextLine();
				continue;
			}
		}
	}

	/**
	 * 주메뉴를 화면에 출력한다.
	 */
	public void mainMenu() {
		System.out.println();
		System.out.println("\t=====Toy Manager=====\t");
		System.out.println("\t1. 장난감 등록\t");
		System.out.println("\t2. 장난감 검색\t");
		System.out.println("\t3. 장난감 삭제\t");
		System.out.println("\t4. 가격대 검색\t");
		System.out.println("\t5. 장난감 정보 출력\t");
		System.out.println("\t9. 종료 \t");
		System.out.println("\t=====BY==JEONG=====\t");
		System.out.print("\t[메뉴 선택]\t");
	}

	/**
	 * 장난감 추가를 위해 메뉴를 호출하고 해당 메뉴에 대한 선택을 입력받은 후 Toy 객체를 생성하는 makeToy() 메서드를 호출 한 후
	 * 리턴된 Toy 객체를 List에 삽입한다.
	 */
	public void insertToy() {

		while (true) {

			int iNum = 0;

			try {

				insertMenu();

				iNum = sc.nextInt();

				if (iNum == 9) {

					return;

				}

			}

			catch (Exception e) {

				System.out.println("오류>>>>>다시선택해주세요.\n");

				sc.nextLine();

				continue;

			}

			Toy toy = makeToy(iNum);

			manager.insertToy(toy);

		}

	}

	/**
	 * 장난감 객체를 등록하기 위한 메뉴를 화면에 출력
	 */
	// 2중 메뉴
	public void insertMenu() {
		System.out.println("\t**장난감 등록 메뉴**\t");
		System.out.println("\t1.자전거\t");
		System.out.println("\t2.드  론\t");
		System.out.println("\t3.게임기\t");
		System.out.println("\t9.상위매뉴\t");
		System.out.print("\t[장난감  선택]\t");

	}

	/**
	 * 장난감 객체를 저장하기 위해 Toy 객체를 생성한다. 장난감의 종류에 따라 자전거(1. 도로용, 2. 산악용), 드론(날개 갯수),
	 * 게임기(휴대가능 여부)를 입력받는다.
	 * 
	 * @param toyType 장난감 종류
	 * @return 생성된 장난감 객체
	 */
	public Toy makeToy(int toyType) {
		Toy toy = null;
		String name, serialNum;
		int price = 0;

		while (true) {
			try {
				sc.nextLine();
				System.out.print("\t>> 고유번호:\t");
				serialNum = sc.nextLine();
				System.out.print("\t>> 이름:\t");
				name = sc.nextLine();
				System.out.print("\t>> 가격:\t");
				price = sc.nextInt();
				switch (toyType) {
				case 1:
					String type = null;
					System.out.print("\t>> 자전거 종류(1.도로용," + " 2.산악용)==>");
					int tNum = sc.nextInt();

					switch (tNum) {
					case 1:
						type = "road";
						break;
					case 2:
						type = "mountain";
						break;
					default:
						System.out.println("間違ったな～");
						break;
					}
					toy = new Bicycle(serialNum, name, price, type);
					break;
				case 2:
					System.out.print(">> 드론 날개수 입력:");
					int wingCount = 0;
					wingCount = sc.nextInt();
					toy = new Drone(serialNum, name, price, wingCount);
					break;
				case 3:
					System.out.println(">> 게임콘솔휴대성(Y/N)");
					boolean isPortable = false;
					String yn = null;
					yn = sc.nextLine();
					if (yn.equals("Y")) {
						isPortable = true;
					} else {
						isPortable = false;
					}
					toy = new GameConsole(serialNum, name, price, isPortable);
					break;
				}
				return toy;
			} catch (Exception e) {
				System.out.println("1,2,3 만입력해주셈");
				sc.nextLine();
				continue;
			}

		}
	}

	/**
	 * 고유번호에 해당하는 장난감을 검색하여 화면에 출력한다. 검색이 되지 않을 경우 메시지 출력
	 */
	public void searchToy() {
		while (true) {

			System.out.print(">>>>장난감고유번호: ");
			String serialNum = sc.next();
			Toy sToy = manager.searchToy(serialNum);
			if (sToy != null) {
				System.out.println(sToy.toString());
			} else {
				System.out.println("검색실패>>>>>입력하신고유번호의장난감이존재하지않습니다.\n");
			}
			return;
		}
	}

	/**
	 * 장난감의 시리얼번호를 입력받아 해당하는 장난감 정보를 삭제한다.
	 */
	public void deleteToy() {
		int mNum = 3;
		String serialNum = null;
		System.out.println("> 장난감 고유 번호 :");
		serialNum = sc.nextLine();
		boolean res = manager.deleteToy(serialNum);
		if (res) {
			System.out.println("[ㄴ삭제성공]");
		} else {
			System.out.println("[정보] 삭제 대상이 존재하지 않습니다.");
		}
	}

	/**
	 * 가격대 검색 최소 가격과 최대 가격을 입력받아 해당하는 가격 범위 내의 모든 장난감을 검색해서 출력
	 */
	public void searchForPrice() {
		int mNum = 4;
		System.out.println("가격 검색 메뉴");
		System.out.print(">최소 검색 :");
		int minPrice = sc.nextInt();
		System.out.print(">최대 검색 :");
		int maxPrice = sc.nextInt();
		List<Toy> tList = manager.toyListForPrice(minPrice, maxPrice);
		System.out.println(minPrice + "까라" + maxPrice + "마데노결과");
		for (Toy toy : tList) {
			System.out.println(toy);
		}
		System.out.println("총" + tList.size() + "개 입니다");
	}

	/**
	 * 장난감 정보를 화면에 출력 장난감 정보를 출력하고 난 후 검색한 장난감의 개수 출력 검색이 되지 않을 경우 등록된 장난감이 없다는 메시지
	 * 출력
	 */
	public void printToyInfo() {
		while (true) {
			printMenu();
			int pNum = sc.nextInt();
			String msg = "";
			switch (pNum) {
			case 1:
				msg = "총장난감개수: [";
				break;
			case 2:
				msg = "총자전거대수: [";
				break;
			case 3:
				msg = "총드론대수: [";
				break;
			case 4:
				msg = "총게임콘솔대수: [";
				break;
			case 9:
				return;
			default:
				System.out.println("[ 메뉴를다시선택해주세요. ] ");
				continue;
			}
			List<Toy> tList = manager.printToyInfo(pNum);
			if (tList == null || tList.size() == 0) {
				System.out.println(">>>>>등록된장난감이없습니다.");
			}
			else {
				for (Toy toy : tList) {
					System.out.println(toy);
				}
				System.out.println(msg + tList.size() + "] 대");

			}

		}

	}

	/**
	 * 장난감 정보 출력 서브 메서드
	 */
	public void printMenu() {
		System.out.println("\n===== 장난감정보출력 =====");
		System.out.println("1. 전체출력");
		System.out.println("2. 자전거정보출력");
		System.out.println("3. 드론정보출력");
		System.out.println("4. 게임콘솔정보출력");
		System.out.println("9. 상위메뉴");
		System.out.print("[ 선택 ] ");
	}
}
