import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ð���  �ʴ����� �Է��ϼ��� :");
		int n1 = sc.nextInt();//����
		System.out.println(n1+"�ʴ�"+((n1/(60*60)))+"��"+(((n1%(60*60))/60))+"��"+(((n1%(60*60))%60))+"�� �Դϴ�.");

	}
	

}
