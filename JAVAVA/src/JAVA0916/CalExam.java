package JAVA0916;

import java.util.Scanner;

public class CalExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cal cal = new Cal();
		int plus = cal.plus(sc.nextInt(),sc.nextInt());
		System.out.println(plus);

	}

}
