package JAVA0908;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("학급에 몇명 있나요? :");
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + "학생의 점수를 입력하셈 : ");
			a[i] = sc.nextInt();

			sum += a[i];

		}
		System.out.print("학생의평군 :" + (double) sum / (double) size);

	}

}
