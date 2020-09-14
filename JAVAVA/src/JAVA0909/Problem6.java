package JAVA0909;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 숫자입력 : ");
			arr[i] = sc.nextInt();
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j]);

		}

	}
}
