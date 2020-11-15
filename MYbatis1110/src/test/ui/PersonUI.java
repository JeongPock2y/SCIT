package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import test.mgr.PersonManager;
import test.vo.PersonVO;

public class PersonUI {

	// UIŬ������ manager Ŭ������ �޼ҵ忡�� ����ڷκ��� �Է¹��� �����͸� �����Ѵ�.
	// ����managerŬ������ ��ü�� �����ؾ��Ѵ�.
	private PersonManager mgr = new PersonManager();
	private Scanner sc = new Scanner(System.in);

	public PersonUI() {
		System.out.println("-----------");
		System.out.println("1.���");
		System.out.println("2.���");
		System.out.println("3.Ư��ȸ�� ���");
		System.out.println("4.Ư�� ȸ�� ����");
		System.out.println("0.����");
		System.out.println("--------");
		System.out.println("�޴� ��ȣ�� �Է� : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			sc.nextLine();
			System.out.println("---");
			System.out.println("�̸� : ");
			String name = sc.nextLine();
			System.out.println("���� : ");
			int age = sc.nextInt();
			PersonVO p = new PersonVO();
			p.setName(name);
			p.setAge(age);
			boolean check = mgr.insertPerson(p);
			if (check) {
				System.out.println("��� ����");
			} else {
				System.out.println("��� ����");
			}
			break;
		case 2:
			ArrayList<PersonVO> personVO = null;
			System.out.println("����ϰڽ��ϴ�.");
			personVO = mgr.selectPerson();
			for (PersonVO pList : personVO) {
				System.out.println(pList);
			}
			break;
		case 3:
			System.out.print("ȸ����ȣ �Է�: ");
			int n = sc.nextInt();
			PersonVO vo = mgr.selectPersonOne(n);
			// ȸ�� ��ȣ�� �Է� �ߴµ� �� ȸ����ȣ�� ���� ȸ���� �������� �ִ�.
			if (vo != null) {
				System.out.println(vo);
			} else {
				System.out.println("���� ����Դϴ�.");
			}
			break;
		case 4:
			System.out.print("���� �� ȸ����ȣ�� �Է� :");
			int d = sc.nextInt();
			boolean deleteCheck = mgr.deletePerson(d);
			if (deleteCheck) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
			break;
		case 5:
			PersonVO vo1 = new PersonVO();
			System.out.print("������ ȸ�� ��ȣ�� �Է� : ");
			int updateNum = sc.nextInt();
			sc.nextLine();
			System.out.println("�̸� : ");
			String updateName = sc.nextLine();
			System.out.println("���� : ");
			int updateAge = sc.nextInt();
			sc.nextLine();
			vo1.setAge(updateAge);
			vo1.setName(updateName);
			vo1.setNum(updateNum);
			boolean pp = mgr.updatePerson(vo1);
			if (pp) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
			break;
		case 0:
			return;
		default:
			break;
		}
	}
}
