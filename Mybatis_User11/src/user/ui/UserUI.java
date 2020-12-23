package user.ui;

import java.util.ArrayList;
import java.util.Scanner;

import user.mgr.UserManager;
import user.vo.User;

/**
 * ȸ�� ���� ���α׷��� ����� ȭ��
 */
public class UserUI {
	private UserManager mgr = new UserManager();
	private Scanner sc = new Scanner(System.in); // Ű����κ��� �Է¹ޱ� ���� Ŭ������ ��ü

	/**
	 * ������. �޴�ȭ���� ���� ������� �Է��� �޴´�.
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
				default:System.out.println("�ٸ� ����");break;
				}
			
		}
		}


	/**
	 * ���� �޴��� ����Ѵ�.
	 */
	public void printMainMenu() {
		System.out.println("[ ȸ�� ���� ]");
		System.out.println("1. ȸ������ ���");
		System.out.println("2. ��ü ȸ�� ���");
		System.out.println("9. ���α׷� ����");
		System.out.print("* �޴� ��ȣ�� �����ϼ��� > ");
	}

	/**
	 * ȸ������ ���
	 */
	void insert() {
		sc.nextLine();
		System.out.print("ȸ������  : ");
		String id=sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("����(��:M �� :F �Է�): ");
		String gender = sc.nextLine();
		gender = gender.toUpperCase();
		System.out.print("�߰����� �Է� �Ͻðڽ��ϱ�?(y/n)");
		String check = sc.nextLine();
		
		if(check.equalsIgnoreCase("y")) {
			System.out.print("��ȭ��ȣ :");
			String phone = sc.nextLine();
			System.out.print("�ּ� :");
			String address = sc.nextLine();
			User user =  new User(id, name, gender, phone, address);
			boolean n =mgr.insertUser(user);
			if (n) {
				System.out.println("����Ǿ����ϴ�");
			}else {
				System.out.println("����");
			}
		}else if(check.equalsIgnoreCase("n")) {
			User user = new User(id, name, gender);
			boolean n =mgr.insertUser(user);
			if (n) {
				System.out.println("����Ǿ����ϴ�");
			}else {
				System.out.println("����");
			}
		}
		
	}

	/**
	 * ��ü ȸ�� ���
	 */
	void list() {
		System.out.println("[��ü ȸ�� ���]");
		ArrayList<User> list = null;
		list= mgr.listUser();
		for (User user : list) {
			System.out.println(user);
		}
				
	}

}
