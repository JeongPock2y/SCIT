import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ�� ������ �Է� :");
		double a = sc.nextInt();
		System.out.print("��ǰ�� ���Ű� �Է� :");
		double b = sc.nextInt();
		System.out.println("�������� :"+(b/a)*100+"%");
	}

}
