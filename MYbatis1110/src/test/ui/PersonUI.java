package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import test.mgr.PersonManager;
import test.vo.PersonVO;

public class PersonUI {

	// UI클래스는 manager 클래스의 메소드에게 사용자로부터 입력받은 데이터를 전달한다.
	// 따라서manager클래스의 객체를 생성해야한다.
	private PersonManager mgr = new PersonManager();
	private Scanner sc = new Scanner(System.in);

	public PersonUI() {
		System.out.println("-----------");
		System.out.println("1.등록");
		System.out.println("2.출력");
		System.out.println("3.특정회원 출력");
		System.out.println("4.특정 회원 삭제");
		System.out.println("0.종료");
		System.out.println("--------");
		System.out.println("메뉴 번호를 입력 : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			sc.nextLine();
			System.out.println("---");
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			PersonVO p = new PersonVO();
			p.setName(name);
			p.setAge(age);
			boolean check = mgr.insertPerson(p);
			if (check) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
			break;
		case 2:
			ArrayList<PersonVO> personVO = null;
			System.out.println("출력하겠습니다.");
			personVO = mgr.selectPerson();
			for (PersonVO pList : personVO) {
				System.out.println(pList);
			}
			break;
		case 3:
			System.out.print("회원번호 입력: ");
			int n = sc.nextInt();
			PersonVO vo = mgr.selectPersonOne(n);
			// 회원 번호를 입력 했는데 그 회원번호를 가진 회원이 없을수도 있다.
			if (vo != null) {
				System.out.println(vo);
			} else {
				System.out.println("없는 사람입니다.");
			}
			break;
		case 4:
			System.out.print("삭제 할 회원번호를 입력 :");
			int d = sc.nextInt();
			boolean deleteCheck = mgr.deletePerson(d);
			if (deleteCheck) {
				System.out.println("삭제");
			} else {
				System.out.println("실패");
			}
			break;
		case 5:
			PersonVO vo1 = new PersonVO();
			System.out.print("수정할 회원 번호를 입력 : ");
			int updateNum = sc.nextInt();
			sc.nextLine();
			System.out.println("이름 : ");
			String updateName = sc.nextLine();
			System.out.println("나이 : ");
			int updateAge = sc.nextInt();
			sc.nextLine();
			vo1.setAge(updateAge);
			vo1.setName(updateName);
			vo1.setNum(updateNum);
			boolean pp = mgr.updatePerson(vo1);
			if (pp) {
				System.out.println("수정");
			} else {
				System.out.println("ㄴㄴ");
			}
			break;
		case 0:
			return;
		default:
			break;
		}
	}
}
