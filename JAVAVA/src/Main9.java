import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 정수 입력 :");
		int num1 = sc.nextInt();
		System.out.println("2번째 정수 입력 :");
		int num2 = sc.nextInt();
		System.out.println("3번째 정수 입력 :");
		int num3 = sc.nextInt();
		 
		if(num1<num2) {
			int a=num1;
			num1=num2;
			num2 = a;	
		}if(num1<num3) {
			int a =num3;
			num3 = num1;
			num1 = a;
		}if(num2<num3) {
			int a = num3;
			num3 = num2;
			num2 = a;
		}
		
			System.out.printf("%d,%d,%d",num1,num2,num3);
			
		}
	}


