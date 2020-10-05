package HOMEWORK;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerMainArrayList{

	public static void main(String[] args) {

		List<Customer> slist = new ArrayList<Customer>();
		Scanner sc = new Scanner(System.in);
		String PhoneNum;// ��ȸ�� �ѹ�
		int count = 0;
		while (true) {
			System.out.println("====================");
			System.out.println("1. ����");
			System.out.println("2. ��ȸ");
			System.out.println("3. ��ü���");
			System.out.println("4. ���α׷� ����");
			System.out.println("====================");
			int menu = sc.nextInt();
			Customer cus = new Customer();
			if (menu == 1) {// ��� ����
				System.out.println("���� : 1");
				if (count >= 1000) {
					System.out.println("�ִ� 10000������� �Է��� �����մϴ�.");
					break;
				}
				sc.nextLine();
				System.out.print("�̸��� �Է��Ͻÿ� :");
				cus.setName(sc.nextLine());

				System.out.print("����ȣ :");
				cus.setCarNum(sc.nextLine());

				System.out.print("��ȭ��ȣ :");
				cus.setPhone(sc.nextLine());

				System.out.print("��ġ :");
				cus.setPlace(sc.nextLine());
				slist.add(cus);
				count++;
			} else if (menu == 2) {// ��ȸ ���
				System.out.println("����:2");
				System.out.print("��ȭ��ȣ �Է� : ");
				sc.nextLine();
				PhoneNum = sc.nextLine();
				for (int i = 0; i < slist.size(); i++) {
					if (slist.get(i).getPhone().equals(PhoneNum)) {
						System.out.println("�̸� :"+slist.get(i).getName());
						System.out.println("�� ��ȣ :"+slist.get(i).getCarNum());
						System.out.println("��ȭ��ȣ :"+slist.get(i).getPhone());
						System.out.println("��ġ :"+slist.get(i).getPlace());
					} else {
						System.out.println("�˻������ �����ϴ�.");
						System.out.println("�ٸ� ����� �Է��� �ּ���.");
					}
				}
			}
			// ��ü��±��
			else if (menu == 3) {
				System.out.println("���� : 3");
				for (Customer n : slist) {// foreach������ ���
					System.out.println("�̸� :" + n.getName());
					System.out.println("����ȣ :" + n.getCarNum());
					System.out.println("��ȭ��ȣ :" + n.getPhone());
					System.out.println("��ġ :" + n.getPlace());
				}

			} else if (menu == 4) {
				System.out.println("���� : 4");
				System.out.println("���α׷��������մϴ�");
				System.exit(-1);
			}

		}

	}
}
