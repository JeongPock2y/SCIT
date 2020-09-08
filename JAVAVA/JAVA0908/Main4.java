package JAVA0908;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int value;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세용 :");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번째 값을 입력하세요 : ");
			value = sc.nextInt();
			
				sum += value;
				

			}System.out.print("배열 요소의 총 합은 :" + sum);
			
		}
	}


