package JAVA0908;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print((i+1) + "번째 값 입력 =>");
			arr[i]=sc.nextInt();
			
			
		}
		System.out.println("-------------");
		for(int i =0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
