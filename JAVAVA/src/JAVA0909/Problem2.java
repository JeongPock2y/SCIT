package JAVA0909;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 번호입력");
		int arr[] = { 20, 25, 30, 10, 15, 5 };
		int temp=0;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		
			temp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = temp;

		
		for (int i = 0; i <= 5; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
