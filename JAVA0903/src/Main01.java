import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을  초단위로 입력하세요 :");
		int n1 = sc.nextInt();//정수
		System.out.println(n1+"초는"+((n1/(60*60)))+"시"+(((n1%(60*60))/60))+"분"+(((n1%(60*60))%60))+"초 입니다.");

	}
	

}
