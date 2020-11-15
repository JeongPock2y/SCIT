package tourarea.ui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import tourarea.manager.TourManager;
import tourarea.vo.Palace;
import tourarea.vo.Park;
import tourarea.vo.TourArea;

/**
 * ����� �������̽�
 */
public class TourUI {
	Scanner input = new Scanner(System.in);
	TourManager manager = new TourManager();

	/**
	 * ������
	 */
	public TourUI() {
		int languageNum = 0;
		int menuNum = 0;
			printlanguageMenu();
			languageNum=input.nextInt();
				// ���α׷� ����ñ��� ���� �ݺ�
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
//							System.out.println("[����] �ٽ� �����ϼ���.");
//						}
//					} catch (Exception e) {
//						System.out.println("[����] �Է������� �߸��Ǿ����ϴ�.");
//						input.nextLine();
//					}
//				}
//				//�Ϻ���
//				if (languageNum == 2) {
//
//				}
//			}
		
	}

	// ù��°�� ��� ������
	public void printlanguageMenu() {
		System.out.println("***LANGUAGE***");
		System.out.println("*****SELECT*****");
		System.out.println("\t1.KOREA\t");
		System.out.println("\t2.JAPAN\t");
		System.out.print(">>Insert Num>> ");
	}

	public void printMainMenu() {
		System.out.println();
		System.out.println("�� *�������� ���� �˾ƺ���!!* ��");
		System.out.println("��\t1. ������ �Է�\t\t��");
		System.out.println("��\t2. ������ �˻�\t\t��");
		System.out.println("��\t3. ������ ����\t\t��");
		System.out.println("��\t4. ������ ����\t\t��");
		System.out.println("��\t0. ���α׷� ����\t\t��");
		System.out.print("** ��ȣ ���� > ");
	}

	public void insertMenu() {
		System.out.println("");
	}

	public void add() {

//		switch (num) {
//		case 1:
//			System.out.print("��� ��å > ");
//			era = input.nextDouble();
//			System.out.print("�̴� > ");
//			inning = input.nextInt();
//			System.out.print("�� > ");
//			wins = input.nextInt();
//			System.out.print("�� > ");
//			losses = input.nextInt();
//			System.out.print("���̺� > ");
//			save = input.nextInt();
//			System.out.print("Ȧ�� > ");
//			hold = input.nextInt();
//
//			player = new Palace(id, name, team, salary, war, era, inning, wins, losses, save, hold);
//			break;
//		case 2:
//			System.out.print("Ÿ�� > ");
//			average = input.nextDouble();
//			System.out.print("Ÿ�� > ");
//			atbat = input.nextInt();
//			System.out.print("Ÿ�� > ");
//			rbi = input.nextInt();
//			System.out.print("���� > ");
//			score = input.nextInt();
//
//			player = new Park(id, name, team, salary, war, average, atbat, rbi, score);
//			break;
//		}
//	}catch(
//
//	InputMismatchException e)
//	{
//		System.out.println("[����] �Է������� �߸��Ǿ����ϴ�.");
//		input.nextLine();
//		return;
//	}
//
//	boolean res = manager.insertPlayer(player);if(res)
//	{
//		System.out.println("[����] ����Ǿ����ϴ�.");
//	}else
//	{
//		System.out.println("[����] ���� �����߽��ϴ�.");
//	}
	}

	public void delete() {
		String id = null;

		System.out.println();
		System.out.println("[ ���� ���� ]");
		System.out.print("** ������ ���� ��ȣ > ");
		id = input.next();

		boolean res = manager.deletePlayer(id);
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
		System.out.println("[ ���� ���� ]");
		System.out.print("** ������ ���� ��ȣ > ");
		id = input.next();

		player = manager.searchId(id);
		if (player == null) {
			System.out.println("[����] �ش� ��ȣ�� ���� ������ �����ϴ�.");
			return;
		}

		try {
			System.out.print("** ������ ���� ���� > ");
			fee = input.nextInt();
		} catch (Exception e) {
			System.out.println("[����] �Է������� �߸��Ǿ����ϴ�.");
			input.nextLine();
			return;
		}

		player.setFee(fee);
		boolean res = manager.updatePlayer(player);
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
		ArrayList<TourArea> list = null;

		try {
			System.out.println();
			System.out.println("[ �˻� ]");
			System.out.println("1. ��ü");
			System.out.println("2. ����");
			System.out.println("3. Ÿ��");
			System.out.println("4. ����Ʈ �÷��̾�");
			System.out.println("5. ���� �˻�");
			System.out.print("** �޴� ���� > ");

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
				System.out.print("���� ���� : ");
				min = input.nextInt();
				System.out.print("�ְ� ���� : ");
				max = input.nextInt();

				list = manager.tourAreaListForFee(min, max);
				break;
			default:
				System.out.println("[����] �߸� �����߽��ϴ�.");
				return;
			}
			print(list);
		} catch (InputMismatchException ex) {
			System.out.println("[����] �Է������� �߸��Ǿ����ϴ�.");
			input.nextLine();
		}
	}

	// ��� ���
	public void print(ArrayList<TourArea> list) {
		System.out.println();
		if (list == null || list.size() == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("�� " + list.size() + "���� �˻� ����� �ֽ��ϴ�.");
	}

	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("�����մϴ�.");
		return;
	}

}