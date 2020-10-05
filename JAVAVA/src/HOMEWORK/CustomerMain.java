package HOMEWORK;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer[] cArray = new Customer[10000];

		String name, phone, carNum, place;
		int menu;
		int count = 0;
		while (true) {
			System.out.println("=========*==========");
			System.out.println("1. ����");
			System.out.println("2. ��ȸ");
			System.out.println("3. ��ü���");
			System.out.println("4. ���α׷� ����");
			System.out.println("=========*==========");
			Customer customer = new Customer();
			menu = sc.nextInt();
			// ���� ȭ��
			switch (menu) {
			case 1:
				if (count >= cArray.length) {
					System.out.println("�ִ� 10000������� �Է��� �����մϴ�.");
					break;
				}
				System.out.println("����: " + menu);
				System.out.println("*****************");
				sc.nextLine();
				System.out.print("�̸��� �Է�: ");
				customer.setName(sc.nextLine());
				System.out.print("�� ��ȣ�� �Է�: ");
				customer.setCarNum(sc.nextLine());
				System.out.print("��ȭ��ȣ�� �Է�: ");
				customer.setPhone(sc.nextLine());
				System.out.print("��ġ�� �Է�: ");
				customer.setPlace(sc.nextLine());
				cArray[count] = customer;
				count++;
				break;

			// ��ȸȭ��
			case 2:
				System.out.println("����: " + menu);
				System.out.println("*****************");
				sc.nextLine();
				System.out.print("��ȭ��ȣ �Է�: ");
				for (int i = 0; i < cArray.length; i++) {
						if (sc.nextLine().equals(cArray[i].getPhone())) {
							System.out.println("=== ��ȸ�� ȸ������ ===");
							System.out.println("�̸� : " + cArray[i].getName());
							System.out.println("����ȣ : " + cArray[i].getCarNum());
							System.out.println("��ȭ��ȣ : " + cArray[i].getPhone());
							System.out.println("��ġ : " + cArray[i].getPlace());
						} else {
							System.out.println("�˻������ ã�� �� �����ϴ�.");
							break;
						}
					}
				
				// ��ü���ȭ��
			case 3:
				System.out.println("����: " + menu);

				for (int i = 0; i < count; i++) {
					System.out.println("-----" + (i + 1) + "��° ȸ��" + "-----");
					System.out.println("�̸� : " + cArray[i].getName());
					System.out.println("����ȣ : " + cArray[i].getCarNum());
					System.out.println("��ȭ��ȣ : " + cArray[i].getPhone());
					System.out.println("��ġ : " + cArray[i].getPlace());
					System.out.println("******************************");

				}

				break;

			// ���α׷� ����
			case 4:
				System.out.println("����: " + menu);
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(-1);

			}

		}

	}

}