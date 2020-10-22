package JAVA1013;

import java.util.*;

public class Number {
	private static final int SIZE = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < SIZE; i++) {
			System.out.println((i + 1) + "번째 데이터==>");
			Integer num = sc.nextInt();
			list.add(num);

		}
	}

}
