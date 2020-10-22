package addressbook.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import addressbook.manager.AddressManager;
import addressbook.vo.AddressVO;

/**
 * 사용자 화면을 구성하고 키보드로부터의 입력을 담당하는 클래스
 */
public class AddressUI {
	/**
	 * 주소 정보 처리 기능을 담당하는 클래스의 객체
	 */
	AddressManager manager;
	/**
	 * 키보드 입력 기능의 객체
	 */
	Scanner scan;

	/**
	 * 기본 생성자 - 현재 객체 최초 생성시 AddressManager와 Scanner 클래스의 객체를 생성하여 사용한다.
	 */
	public AddressUI() {
		manager = new AddressManager();
		scan = new Scanner(System.in);
	}

	/**
	 * 메뉴 출력 화면 & 메뉴 번호 입력
	 * 
	 * @return 사용자가 입력한 메뉴 번호
	 */
	public int menu() {
		int num=0;
		System.out.println("┌───────────────────────┐");
		System.out.println("│\t[ 주소록 ]\t│");
		System.out.println("│1.\t새 주소 등록\t│");
		System.out.println("│2.\t주소록 출력\t│");
		System.out.println("│3.\t이름 검색\t\t│");
		System.out.println("│4.\t그룹검색\t\t│");
		System.out.println("│5.\t주소 삭제\t\t│");
		System.out.println("│6.\t주소 업데이트\t│");
		System.out.println("│0.\t프로그램 종료\t│");
		System.out.println("└───────────────────────┘");
		System.out.print("* 번호선택 : ");
		return num= scan.nextInt();
		
	}

	/**
	 * 새 주소 정보 입력 화면
	 */
	public void input() {
		int num = 1;
		scan.nextLine();
		System.out.println("[ 새 주소 등록]");
		System.out.print("등록할 이름 :");
		String name = scan.nextLine();
		AddressVO vo = manager.getAddress(name);
		if (vo == null||"".equals(name)) {
			System.out.print("그룹 :");
			String group = scan.nextLine();
			System.out.print("전화 :");
			String phone = scan.nextLine();
			System.out.print("주소 :");
			String address = scan.nextLine();
			System.out.print("이메일 :");
			String email = scan.nextLine();
			// 입력된 정보를 등록하는 기능을 실행한다.
			AddressVO param = new AddressVO(name, group, phone, address, email);
			manager.addAddress(param);
			System.out.print("[알림] 등록되었습니다.");
		} else {
			System.out.println("[알 림] 이미 등록된 이름입니다.");
		}
	}

	/**
	 * 전체 정보 출력 화면
	 */
	public void output() {
		int num = 2;
		scan.nextLine();
		System.out.println("[주소록 출력]");
		List<AddressVO> list = manager.getList();
		if (list == null || list.size() <= 0) {
			System.out.println("[알림] 등록된 데이터가 없습니다.");
		}
		for (AddressVO addressVO : list) {
			System.out.println(addressVO);
		}
	}             
	/**
	 * 이름으로 주소 검색 화면
	 */
	public void searchName() {
		int num = 3;
		scan.nextLine();
		System.out.println("*이름으로 주소검색*");
		System.out.print("검색할 이름 : ");
		String name = scan.nextLine();
		AddressVO vo = manager.getAddress(name);
		if (vo == null) {
			System.err.println("*알림 검색결과가 없습니다.*");
		} else {
			System.out.println(vo);
		}
	}

	/**
	 * 그룹으로 주소 검색
	 */
	public void searchGroup() {
		int num = 4;
		scan.nextLine();
		System.out.println("*그룹으로 주소검색*");
		System.out.print("검색할 그룹 : ");
		String group = scan.nextLine();
		ArrayList<AddressVO> list = manager.getGroupList(group);
		if (list == null || list.size() <= 0) {
			System.out.println("*알림* 검색결과가 없습니다.");
			for (AddressVO addressVO : list) {
				System.out.println(addressVO);
			}
		}
	}
	/**
	 * 이름으로 찾아서 주소 삭제
	 */
	public void delete() {
		int num = 5;
		System.out.println("[주소 삭제]");
		System.out.print("삭제할 이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		boolean boo = manager.removeAddress(name);
		if (boo) {
			System.out.println("[알림] 데이터가 삭제되었습니다.");
		} else {
			System.out.println("[알림] 삭제할 데이터가 없습니다.");
		}

	}

	public void update() {
		int num = 6;
		System.out.println("주소 업데이터");
		System.out.println("업데이트할 이름");
		scan.nextLine();
		String name = scan.nextLine();
		AddressVO vo = manager.getAddress(name);
		if (vo == null) {
			System.err.println("*알림 업데이트할 결과가 없습니다.*");
		} else {
			System.out.println(vo);
			System.out.println("새로 업데이트할  정보를 입력해주세요");
			System.out.print("그룹 :");
			String group = scan.nextLine();
			System.out.print("전화 :");
			String phone = scan.nextLine();
			System.out.print("주소 :");
			String address = scan.nextLine();
			System.out.print("이메일 :");
			String email = scan.nextLine();
			AddressVO updateData = new AddressVO(name, group, phone, address, email);
			manager.updateAddress(updateData);
			System.out.println("[알림 * 수정되었습니다.]");

		}
	}

	/**
	 * 프로그램 종료 시 마무리 작업
	 */
	public void end() {
		int num = 0;
		System.out.println("[알림] 프로그램을 종료합니다.");

	}

}
