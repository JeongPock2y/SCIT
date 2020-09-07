package JAVA0907a;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요! : ");
		int ArrLength = sc.nextInt();
		int[] intArr = new int[ArrLength];
		for (int i = 0; i < ArrLength; i++) {
			System.out.println("--------");
			System.out.print((i+1)+"번째 숫자입력");
		
			intArr[i] = sc.nextInt();
		}
		System.out.println("배열의 길이는 :"+ArrLength);
		System.out.println("@@@@@@@@@@");
		for (int i = 0; i < ArrLength; i++) {
			
			System.out.println("intArr["+i+"]의 값은 :"+intArr[i]);

		}
	}
}
