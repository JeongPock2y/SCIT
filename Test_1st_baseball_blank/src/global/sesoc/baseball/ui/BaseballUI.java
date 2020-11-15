package global.sesoc.baseball.ui;

import java.util.ArrayList;
import java.util.Scanner;

import global.sesoc.baseball.manager.BaseballManager;
import global.sesoc.baseball.vo.Batter;
import global.sesoc.baseball.vo.Pitcher;
import global.sesoc.baseball.vo.Player;

/**
 * ����� �������̽�
 */
public class BaseballUI {
	Scanner sc = new Scanner(System.in);
	BaseballManager manager = new BaseballManager();
	/**
	 * ������
	 */
	public BaseballUI() {
		int menuNum = 0;
		while (true) {
			this.printMainMenu();
			// ���α׷� ����ñ��� ���� �ݺ�
			try {
				menuNum = sc.nextInt();
				switch (menuNum) {
				case 1:
					add();
					break;
				case 2:
					delete();
					break;
				case 3:
					update();
					break;
				case 4:
					search();
					break;
				case 0:
					exit();
					return;
				default://�������̾ƴҶ�
					System.out.println("[�� ��]�ٽ� �����ϼ���.");
				}
			} catch (Exception e) {
				System.out.println("[���� ] �Է������� �߸��Ǿ����ϴ�.");
				sc.nextLine();//���������� enter�� ģ�ٰ� ���� �ϱ�
			}
		}
	}

	/**
	 * ���� �޴� ���
	 */
	public void printMainMenu() {
		System.out.println("��������������������������������������������������");
		System.out.println("��\t[ �߱������������� ]\t��");
		System.out.println("��1.\t���������Է�\t��");
		System.out.println("��2.\t������������\t��");
		System.out.println("��3.\t������������\t��");
		System.out.println("��4.\t�˻�\t\t��");
		System.out.println("��0.\t���α׷�����\t��");
		System.out.println("��������������������������������������������������");
		System.out.print("* ��ȣ���� : ");
	}

	/**
	 * ���� ���� �Է�
	 */
	public void add() {
		int menuNum = 1;
		sc.nextLine();
		System.out.println("[���� ���]");
		System.out.println("1. ����");
		System.out.println("2. Ÿ��");
		System.out.print("** ���� ���� ����> ");
		int check = sc.nextInt();
		System.out.print("** ���� ���� ��ȣ> ");
		String id = sc.nextLine();
		Player player = manager.searchId(id);
		if (player != null) {
			// �̸� �� �ִٸ� ���� �� �������°�
			System.out.println("[����] �̹� �����ϴ� ��ȣ�Դϴ�.");
		}
		// ����
		else if (check == 1) {
			sc.nextLine();
			System.out.print("���� �̸� > ");
			String name = sc.nextLine();
			System.out.print("�Ҽ��� > ");
			String team = sc.nextLine();
			System.out.print("���� > ");
			int salary = sc.nextInt();
			System.out.print("WAR > ");
			double war = sc.nextInt();
			System.out.print("��� ��å > ");
			int era = sc.nextInt();
			System.out.print("�̴� > ");
			int inning = sc.nextInt();
			System.out.print("�� > ");
			int wins = sc.nextInt();
			System.out.print("�� > ");
			int losses = sc.nextInt();
			System.out.print("���̺� > ");
			int save = sc.nextInt();
			System.out.print("Ȧ�� > ");
			int hold = sc.nextInt();
			// Ÿ�����÷��̾ �־���
			Pitcher pitcher = new Pitcher(id, name, team, salary, war, era, inning, wins, losses, save, hold);
			manager.insertPlayer(pitcher);
			System.out.println("[����] ����Ǿ����ϴ�.");

		}

		// Ÿ��
		else if (check == 2) {
			sc.nextLine();
			System.out.print("���� �̸� > ");
			String name = sc.nextLine();
			System.out.print("�Ҽ��� > ");
			String team = sc.nextLine();
			System.out.print("���� > ");
			int salary = sc.nextInt();
			System.out.print("WAR > ");
			double war = sc.nextInt();
			System.out.print("Ÿ�� > ");
			int average = sc.nextInt();
			System.out.print("Ÿ��> ");
			int atbat = sc.nextInt();
			System.out.print("Ÿ�� > ");
			int rbi = sc.nextInt();
			System.out.print("���� > ");
			int score = sc.nextInt();
			// ����������������Ʈ�� �־���
			Batter batter = new Batter(id, name, team, salary, war, average, atbat, rbi, score);
			manager.insertPlayer(batter);
			System.out.println("[����] ����Ǿ����ϴ�.");

		}

	}

	/**
	 * ���� ���� ����
	 */
	public void delete() {
		int menuNum = 2;
		System.out.println("[���� ����]");
		System.out.print("** ������ ���� ��ȣ> ");
		String id = sc.nextLine();
		boolean removechecker = manager.deletePlayer(id);
		if (removechecker) {
			System.out.println("[�˸�] �����Ͱ� �����Ǿ����ϴ�.");
		} else {
			System.out.println("[�˸�] ������ �����Ͱ� �����ϴ�.");
		}
	}

	/**
	 * ���� ���� ����
	 */
	public void update() {
		int menuNum = 3;
		sc.nextLine();
		System.out.println("[���� ����]");
		System.out.print("** ������ ���� ��ȣ > ");
		String id = sc.nextLine();
		Player player = manager.searchId(id);
		if (player == null) {
			System.out.println("*�˸� ������Ʈ�� ���� ������ �����ϴ�.*");
		} else {

			System.out.print("** ������ ���� ���� >");
			int salary = sc.nextInt();
			player.setSalary(salary);
			boolean boo = manager.updatePlayer(player);
			System.out.println("[����] �����Ǿ����ϴ�.");
		}
	}

	/**
	 * ���� ���� �˻�
	 */
	public void search() {
		int menuNum = 4;
		int key = 0;
		//�����͸� ��ƾ��ϴϱ�  ���������� 1���̻� ���ü������ϱ�
		//���������ͿͰ���  �׷��ϰ�  ���⵵ ��̸���Ʈ ���⵵ ��̸���Ʈ
		ArrayList<Player> list = null;
		// 4�������� �׾ȿ� �˻��� �ȿ� ��ü ���� Ÿ�� �� ���ͼ� �Է��Ѱ� ������
		sc.nextLine();
		System.out.println("[�˻�]");
		System.out.println("1. ��ü");
		System.out.println("2. ����");
		System.out.println("3. Ÿ��");
		System.out.println("4. ����Ʈ �÷��̾�");
		System.out.println("5. ���� �˻�");
		System.out.print("** �޴� ����  > ");
		key = sc.nextInt();
		switch (key) {
		case 1:
		case 2:
		case 3:
			list=manager.playerListForType(key);
			break;
			//1/2/3/case ��� ���� �Ŵϱ�  �̷��� �ٿ�����������
		case 4:
			manager.bestPlayers();
			break;
		case 5:
			System.out.println("���� ����>>>");
			int mins = sc.nextInt();
			System.out.println("�ְ� ����>>>");
			int maxs = sc.nextInt();
			manager.playerListForSalary(mins, maxs);
			break;

		}
		print(list);

	}

	// ��� ���
	public void print(ArrayList<Player> list) {
//print(list);  ��¹��� �ۼ����־���Ѵ�.
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
	

	/**
	 * ���α׷� ����
	 */
	public void exit() {
		int menuNum = 0;
		System.out.println("���α׷��� �����մϴ�.����");
		System.exit(0);
		return;
	}

}
