package JAVA0900;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("num1 값 :");
		int num1 = sc.nextInt();
		System.out.print("num2 값 :");
		int num2 = sc.nextInt();
		
		System.out.println("----교환전----");
		System.out.println("num1 의 값 :"+num1);
		System.out.println("num2 의 값 :"+num2);
		System.out.println();
		System.out.println("----교환후----");
		System.out.println("num1 의 값 :"+num2);
		System.out.println("num2 의 값 :"+num1);
		

	}

}
