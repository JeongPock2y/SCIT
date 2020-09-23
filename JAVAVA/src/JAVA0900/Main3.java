package JAVA0900;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 :");
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
		if((n%i)==0) {
			System.out.println(i);
			}
		}
	}

}
