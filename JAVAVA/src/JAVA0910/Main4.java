package JAVA0910;

import java.util.Random;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int numRan = ran.nextInt(50) + 1;
		System.out.println(numRan);
		System.out.println("1-50사이의 랜덤한 숫자가 생성되었습니다.");
		
		while (true) {
			System.out.print("숫자를 입력하여 맞춰주세요 :");
			int num = sc.nextInt();
			if (numRan > num) {
				System.out.println("Down");
				continue;
			}
			else if (numRan < num) {
				System.out.println("UP");
				continue;
			}
			else if(numRan==num) {
				System.out.println("Good");
				break;
			}

		}

	}

}
