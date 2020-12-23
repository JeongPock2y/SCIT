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
	private Scanner sc = new Scanner(System.in); 	//Ű����κ��� �Է¹ޱ� ���� Ŭ������ ��ü
	
	/**
	 * ������. �޴�ȭ���� ���� ������� �Է��� �޴´�.
	 * */
	public UserUI() {
		
		while(true) {
			//���θ޴��� ����Ѵ�
			printMainMenu();
			
			//�޴���ȣ�� ���ڷ� �Է¹޴´�
			int no = 0;
			try {
				no = sc.nextInt();
			}
			catch (Exception e) {	//���ڷ� �Է¹��� �� ���� ������ �� ��� Exception ó��.
				sc.nextLine();		//���ۿ� �����ִ� ���ڵ� ����
			}
			
			//�Է¹��� ��ȣ�� ���� ó��
			switch(no){
				//ȸ������ ���
				case 1:  
					insert();
					break;
				
				//��üȸ�� ����
				case 2: 
					list();
					break;
					
				// ���α׷��� �����Ѵ�
				case 9: 
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					
				default:
					System.out.println("��ȣ�� �ٽ� �����ϼ���.");
			}
		}
	}
	

	
	/**
	 * ���� �޴��� ����Ѵ�.
	 * */
	public void printMainMenu(){
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
		User user;
		boolean res;
		String yn;
		
		System.out.println("[ ȸ������ ��� ]");
		sc.nextLine();			//�ռ� ���� ���๮�� ����
		
		user = new User();
		
		System.out.print("ID: ");
		user.setId(sc.nextLine());
		System.out.print("�̸�: ");
		user.setName(sc.nextLine());
		System.out.print("���� (��:M ��:F �Է�): ");
		user.setGender(sc.nextLine().toUpperCase());
		
		System.out.print("�߰� ������ �Է��Ͻðڽ��ϱ�? (y/n) ");
		yn = sc.nextLine();
		
		if (yn.equalsIgnoreCase("y")) {
			System.out.print("��ȭ��ȣ: ");
			user.setPhone(sc.nextLine());
			System.out.print("�ּ�: ");
			user.setAddress(sc.nextLine());
		}

		res = mgr.insertUser(user);
		
		if (res) {
			System.out.println("����Ǿ����ϴ�.");
		}
		else {
			System.out.println("���� �����Ͽ����ϴ�.");
		}
	}
	
	/**
	 * ��ü ȸ�� ���
	 */
	void list() {
		System.out.println("[ ��ü ȸ�� ��� ]");
		ArrayList<User> list = mgr.listUser();
		
		if (list == null || list.size() == 0) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
			return;
		}
		else {
			for (User user : list) {
				System.out.print("ID:" + user.getId() + "\t");
				System.out.print("�̸�:" + user.getName() + "\t");
				System.out.print("����:" + user.getGender() + "\t");
				System.out.print("��ȭ:" + user.getPhone() + "\t");
				System.out.println("�ּ�:" + user.getAddress());
			}
		}
	}


}
