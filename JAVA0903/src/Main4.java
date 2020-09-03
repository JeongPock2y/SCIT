import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("0-999까지 정수 입력 : ");
		int a = sc.nextInt();
		
		int n1= (a/100);
		int n2= ((a%100)/10);
		int n3= ((a%100)%10);
		System.out.println(n1+n2+n3);

	}

}
