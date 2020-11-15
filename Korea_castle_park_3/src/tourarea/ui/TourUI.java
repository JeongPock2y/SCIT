package tourarea.ui;

import java.util.ArrayList;

import java.util.Scanner;
import tourarea.manager.TourManager;
import tourarea.vo.Castle;
import tourarea.vo.Park;
import tourarea.vo.TourArea;

/**
 * ����� �������̽�
 */
public class TourUI {
	Scanner sc = new Scanner(System.in);
	TourManager manager = new TourManager();

	/**
	 * ������
	 */
	public TourUI() {
	
		int menuNum = 0;
			
			while (true) {
				printMainMenu();
				try {
					menuNum = sc.nextInt();
					switch (menuNum) {
					case 1:
						add();
						break;
					case 2:
						search();
						break;
					case 3:
						delete();
						break;
					case 4:
						update();
						break;
					case 0:
						exit();
						return;
					default:
						System.out.println("[����] �ٽ� �����ϼ���.");
					}
				} catch (Exception e) {
					System.out.println("[����] �Է������� �߸��Ǿ����ϴ�.");
					sc.nextLine();
				}
			}
		}

	



	public void printMainMenu() {
		System.out.println();
		System.out.println("  *�������� ���� �˾ƺ���!!* ");
		System.out.println("��\t1. ������ �Է�\t\t��");
		System.out.println("��\t2. ������ �˻�\t\t��");
		System.out.println("��\t3. ������ ����\t\t��");
		System.out.println("��\t4. ������ ����\t\t��");
		System.out.println("��\t0. ���α׷� ����\t\t��");
		System.out.print("** ��ȣ ���� > ");
	}
	public void add() {
		TourArea tourarea = null;
		System.out.println();
		System.out.println("--������ ����---");
		System.out.println("1. ��");
		System.out.println("2. ����");
		System.out.print("����� Ÿ���� ����ּ���>>");
		int inum=sc.nextInt();
		sc.nextLine();
		System.out.print("�̸��� �Է�>>>");
		String name = sc.nextLine();
		System.out.print("������� �Է�>>>");
		int fee = sc.nextInt();
		System.out.print("�������۽ð��� �Է�>>>");
		int starttime = sc.nextInt();
		System.out.print("���� ����ð��� �Է�>>>");
		int closetime = sc.nextInt();
		System.out.print("����ö �뼱�� �Է�(1-3ȣ��)>>>");
		int subwayline = sc.nextInt();
		System.out.print("���� ����(Y/N)>>>");
		boolean parking = false;
		String pk = null;
		pk=sc.nextLine();
		if(pk.equals("Y")) {
			parking =true;
		}else {
			parking = false;
		}
		switch(inum){
		case 1 : 
			sc.nextLine();
			System.out.print("������ ��(��)��>>>");
			int birth =sc.nextInt();
			sc.nextLine();
			System.out.print("����� �ô��� ���̸�>>>");
			String king = sc.nextLine();
			tourarea = new Castle(name, fee, starttime, closetime, subwayline, parking, birth, king);
			manager.insertTour(tourarea);
			System.out.println("��(��)�� ������ ����Ǿ���");
			break;
		case 2 :
			sc.nextLine();
			System.out.print("��ġ(�ּ�)�� �Է��� �ּ���>>");
			String location = sc.nextLine();
			System.out.print("������ �������� ������ �Է����ּ���>>> ");
			int manageoffice = sc.nextInt();
			tourarea = new Park(name, fee, starttime, closetime, subwayline, parking, location, manageoffice);
			manager.insertTour(tourarea);
			System.out.println("������ ������ ����Ǿ����ϴ�.");
			break;
			}
		}
	public void delete() {
		String id = null;
		System.out.println();
		System.out.println("[ ������ ���� ���� ]");
		System.out.print("** ������ ��� �̸� > ");
		id = sc.next();
		boolean res = manager.deleteTour(id);
		if (res) {
			System.out.println("[����] �����Ǿ����ϴ�.");
		} else {
			System.out.println("[����] ���� ����� �������� �ʽ��ϴ�.");
		}
	}
	public void update() {
		TourArea player = null;
		String id = null;
		int fee = 0;

		System.out.println();
		System.out.println("[ ������ ��� ���� ]");
		System.out.print("** ������ ��� �̸� > ");
		id = sc.next();
		player = manager.searchId(id);
		if (player == null) {
			System.out.println("[����] �ش� ��ȣ��  ��Ұ� �����ϴ�.");
			return;
		}

		try {
			sc.nextLine();
			System.out.print("** ������ ��� �Է� > ");
			id = sc.nextLine();
			System.out.print("** ������ ����� �Է� > ");
			fee = sc.nextInt();
		} catch (Exception e) {
			System.out.println("[����] �Է������� �߸��Ǿ����ϴ�.");
			sc.nextLine();
			return;
		}
		player.setName(id);
		player.setFee(fee);
		boolean res = manager.updateTour(player);
		if (res) {
			System.out.println("[����] �����Ǿ����ϴ�.");
		} else {
			System.out.println("[����] ���� �����߽��ϴ�.");
		}
	}
	public void search() {
		int num = 0;
		int min = 0;
		int max = 0;
		int subwayline=0;
		ArrayList<TourArea> list = null;
		TourArea tourarea =null;
		try {
			System.out.println();
			System.out.println("[ �˻� ]");
			System.out.println("1. ��ü");
			System.out.println("2. ��(��)");
			System.out.println("3. ����");
			System.out.println("4. ����ö �뼱�� �˻�(1-3ȣ��)");
			System.out.println("5. ��(�̸����� �˻�)");
			System.out.println("6. ����(�̸����� �˻�)");
			System.out.println("7. �����Ŵ�");
			System.out.print("** �޴� ���� >> ");
			num = sc.nextInt();
			switch (num) {
			case 1:
			case 2:
			case 3:
				list = manager.tourAreaListForType(num);
				break;
			case 4:
				System.out.print("�˻��� �뼱�� ��ȣ�� �Է����ּ��� : ");
				subwayline = sc.nextInt();
				list = manager.tourAreaListSubway(subwayline);
				break;
			case 5 ://��
				sc.nextLine();
				System.out.print("ã�� ��(��)�� �̸��� �Է����ּ��� : ");
				String Cname = sc.nextLine();
				tourarea = manager.searchId(Cname);
				System.out.println(tourarea);
				break;
			case 6 ://����
				sc.nextLine();
				System.out.print("ã�� �����̸��� �Է����ּ��� : ");
				String Pname = sc.nextLine();
				tourarea = manager.searchId(Pname);
				System.out.println(tourarea);
				break;
			case 7:
				return;
			default:
				System.out.println("[����] �߸� �����߽��ϴ�.");
				return;
			}
			print(list);
		} catch (Exception e) {
			System.out.println("[����] �Է������� �߸��Ǿ����ϴ�.");
			sc.nextLine();
		}
	}

	// ��� ���
	public void print(ArrayList<TourArea> list) {
		System.out.println();
		if (list == null || list.size() == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
			return;
		}
		for (TourArea tourarea : list) {
			System.out.println(tourarea);
		}
		System.out.println("�� " + list.size() + "���� �˻� ����� �ֽ��ϴ�.");
	}
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("�����մϴ�.");
		return;
	}

}