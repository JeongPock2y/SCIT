package user.ui;

import java.util.ArrayList;
import java.util.Scanner;

import user.mgr.UserManager;
import user.vo.User;

/**
 * 회원 관리 프로그램의 사용자 화면
 */
public class UserUI {
	private UserManager mgr = new UserManager();
	private Scanner sc = new Scanner(System.in); // 키보드로부터 입력받기 위한 클래스의 객체

	/**
	 * 생성자. 메뉴화면을 띄우고 사용자의 입력을 받는다.
	 * */
	public UserUI() {
		int menu =0;
			while (true) {
				this.printMainMenu();
				menu = sc.nextInt();
				switch (menu) {
				case 1: insert();
					break;
				case 2: list();
					break;
				case 9: return;
				default:System.out.println("다른 숫자");break;
				}
			
		}
		}


	/**
	 * 메인 메뉴를 출력한다.
	 */
	public void printMainMenu() {
		System.out.println("[ 회원 관리 ]");
		System.out.println("1. 회원정보 등록");
		System.out.println("2. 전체 회원 목록");
		System.out.println("9. 프로그램 종료");
		System.out.print("* 메뉴 번호를 선택하세요 > ");
	}

	/**
	 * 회원정보 등록
	 */
	void insert() {
		sc.nextLine();
		System.out.print("회원정보  : ");
		String id=sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("성별(남:M 여 :F 입력): ");
		String gender = sc.nextLine();
		gender = gender.toUpperCase();
		System.out.print("추가정보 입력 하시겠습니까?(y/n)");
		String check = sc.nextLine();
		
		if(check.equalsIgnoreCase("y")) {
			System.out.print("전화번호 :");
			String phone = sc.nextLine();
			System.out.print("주소 :");
			String address = sc.nextLine();
			User user =  new User(id, name, gender, phone, address);
			boolean n =mgr.insertUser(user);
			if (n) {
				System.out.println("저장되었습니다");
			}else {
				System.out.println("실패");
			}
		}else if(check.equalsIgnoreCase("n")) {
			User user = new User(id, name, gender);
			boolean n =mgr.insertUser(user);
			if (n) {
				System.out.println("저장되었습니다");
			}else {
				System.out.println("실패");
			}
		}
		
	}

	/**
	 * 전체 회원 목록
	 */
	void list() {
		System.out.println("[전체 회원 목록]");
		ArrayList<User> list = null;
		list= mgr.listUser();
		for (User user : list) {
			System.out.println(user);
		}
				
	}

}
