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
 * ����� �������̽�
 */
public class ToyManagerUI {
	Scanner sc = new Scanner(System.in);
	ToyManagerMgr manager = new ToyManagerMgr();

	/**
	 * ������
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
					System.out.println("��������.");
					return;
				default:
					System.out.println(">>>>>>�ٽ� �Է����ּ���");
					break;
				}

			} catch (Exception e) {
				System.out.println(">>>>>>�Է� ����Miss");
				sc.nextLine();
				continue;
			}
		}
	}

	/**
	 * �ָ޴��� ȭ�鿡 ����Ѵ�.
	 */
	public void mainMenu() {
		System.out.println();
		System.out.println("\t=====Toy Manager=====\t");
		System.out.println("\t1. �峭�� ���\t");
		System.out.println("\t2. �峭�� �˻�\t");
		System.out.println("\t3. �峭�� ����\t");
		System.out.println("\t4. ���ݴ� �˻�\t");
		System.out.println("\t5. �峭�� ���� ���\t");
		System.out.println("\t9. ���� \t");
		System.out.println("\t=====BY==JEONG=====\t");
		System.out.print("\t[�޴� ����]\t");
	}

	/**
	 * �峭�� �߰��� ���� �޴��� ȣ���ϰ� �ش� �޴��� ���� ������ �Է¹��� �� Toy ��ü�� �����ϴ� makeToy() �޼��带 ȣ�� �� ��
	 * ���ϵ� Toy ��ü�� List�� �����Ѵ�.
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

				System.out.println("����>>>>>�ٽü������ּ���.\n");

				sc.nextLine();

				continue;

			}

			Toy toy = makeToy(iNum);

			manager.insertToy(toy);

		}

	}

	/**
	 * �峭�� ��ü�� ����ϱ� ���� �޴��� ȭ�鿡 ���
	 */
	// 2�� �޴�
	public void insertMenu() {
		System.out.println("\t**�峭�� ��� �޴�**\t");
		System.out.println("\t1.������\t");
		System.out.println("\t2.��  ��\t");
		System.out.println("\t3.���ӱ�\t");
		System.out.println("\t9.�����Ŵ�\t");
		System.out.print("\t[�峭��  ����]\t");

	}

	/**
	 * �峭�� ��ü�� �����ϱ� ���� Toy ��ü�� �����Ѵ�. �峭���� ������ ���� ������(1. ���ο�, 2. ��ǿ�), ���(���� ����),
	 * ���ӱ�(�޴밡�� ����)�� �Է¹޴´�.
	 * 
	 * @param toyType �峭�� ����
	 * @return ������ �峭�� ��ü
	 */
	public Toy makeToy(int toyType) {
		Toy toy = null;
		String name, serialNum;
		int price = 0;

		while (true) {
			try {
				sc.nextLine();
				System.out.print("\t>> ������ȣ:\t");
				serialNum = sc.nextLine();
				System.out.print("\t>> �̸�:\t");
				name = sc.nextLine();
				System.out.print("\t>> ����:\t");
				price = sc.nextInt();
				switch (toyType) {
				case 1:
					String type = null;
					System.out.print("\t>> ������ ����(1.���ο�," + " 2.��ǿ�)==>");
					int tNum = sc.nextInt();

					switch (tNum) {
					case 1:
						type = "road";
						break;
					case 2:
						type = "mountain";
						break;
					default:
						System.out.println("���ުê��ʢ�");
						break;
					}
					toy = new Bicycle(serialNum, name, price, type);
					break;
				case 2:
					System.out.print(">> ��� ������ �Է�:");
					int wingCount = 0;
					wingCount = sc.nextInt();
					toy = new Drone(serialNum, name, price, wingCount);
					break;
				case 3:
					System.out.println(">> �����ܼ��޴뼺(Y/N)");
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
				System.out.println("1,2,3 ���Է����ּ�");
				sc.nextLine();
				continue;
			}

		}
	}

	/**
	 * ������ȣ�� �ش��ϴ� �峭���� �˻��Ͽ� ȭ�鿡 ����Ѵ�. �˻��� ���� ���� ��� �޽��� ���
	 */
	public void searchToy() {
		while (true) {

			System.out.print(">>>>�峭��������ȣ: ");
			String serialNum = sc.next();
			Toy sToy = manager.searchToy(serialNum);
			if (sToy != null) {
				System.out.println(sToy.toString());
			} else {
				System.out.println("�˻�����>>>>>�Է��ϽŰ�����ȣ���峭�������������ʽ��ϴ�.\n");
			}
			return;
		}
	}

	/**
	 * �峭���� �ø����ȣ�� �Է¹޾� �ش��ϴ� �峭�� ������ �����Ѵ�.
	 */
	public void deleteToy() {
		int mNum = 3;
		String serialNum = null;
		System.out.println("> �峭�� ���� ��ȣ :");
		serialNum = sc.nextLine();
		boolean res = manager.deleteToy(serialNum);
		if (res) {
			System.out.println("[����������]");
		} else {
			System.out.println("[����] ���� ����� �������� �ʽ��ϴ�.");
		}
	}

	/**
	 * ���ݴ� �˻� �ּ� ���ݰ� �ִ� ������ �Է¹޾� �ش��ϴ� ���� ���� ���� ��� �峭���� �˻��ؼ� ���
	 */
	public void searchForPrice() {
		int mNum = 4;
		System.out.println("���� �˻� �޴�");
		System.out.print(">�ּ� �˻� :");
		int minPrice = sc.nextInt();
		System.out.print(">�ִ� �˻� :");
		int maxPrice = sc.nextInt();
		List<Toy> tList = manager.toyListForPrice(minPrice, maxPrice);
		System.out.println(minPrice + "���" + maxPrice + "��������");
		for (Toy toy : tList) {
			System.out.println(toy);
		}
		System.out.println("��" + tList.size() + "�� �Դϴ�");
	}

	/**
	 * �峭�� ������ ȭ�鿡 ��� �峭�� ������ ����ϰ� �� �� �˻��� �峭���� ���� ��� �˻��� ���� ���� ��� ��ϵ� �峭���� ���ٴ� �޽���
	 * ���
	 */
	public void printToyInfo() {
		while (true) {
			printMenu();
			int pNum = sc.nextInt();
			String msg = "";
			switch (pNum) {
			case 1:
				msg = "���峭������: [";
				break;
			case 2:
				msg = "�������Ŵ��: [";
				break;
			case 3:
				msg = "�ѵ�д��: [";
				break;
			case 4:
				msg = "�Ѱ����ִܼ��: [";
				break;
			case 9:
				return;
			default:
				System.out.println("[ �޴����ٽü������ּ���. ] ");
				continue;
			}
			List<Toy> tList = manager.printToyInfo(pNum);
			if (tList == null || tList.size() == 0) {
				System.out.println(">>>>>��ϵ��峭���̾����ϴ�.");
			}
			else {
				for (Toy toy : tList) {
					System.out.println(toy);
				}
				System.out.println(msg + tList.size() + "] ��");

			}

		}

	}

	/**
	 * �峭�� ���� ��� ���� �޼���
	 */
	public void printMenu() {
		System.out.println("\n===== �峭��������� =====");
		System.out.println("1. ��ü���");
		System.out.println("2. �������������");
		System.out.println("3. ����������");
		System.out.println("4. �����ܼ��������");
		System.out.println("9. �����޴�");
		System.out.print("[ ���� ] ");
	}
}
