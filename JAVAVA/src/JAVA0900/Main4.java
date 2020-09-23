package JAVA0900;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 :");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 :");
		int n2 = sc.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			sum +=i;
		}
		System.out.println(n1+"에서"+n2+"까지의 합은 :"+sum);
		

	}

}
