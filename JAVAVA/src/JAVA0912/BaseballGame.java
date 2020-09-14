package JAVA0912;

import java.util.*;

public class BaseballGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int com[] = new int[3];// computer pick
		int user[] = new int[3];// user pick

		int strike = 0;
		int ball = 0;

		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("컴퓨터 정답");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		while (true) {
			System.out.println("1-9숫자(정수) 입력 -->");
			for (int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
			}
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (user[i] == com[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
				if (strike == 3) {
					System.out.println("축하합니당!!!!!!정답");
					break;
				} else {
					System.out.println(strike + "스트라이크 " + ball + "볼" + "입니다.");
					strike =0;
					ball=0;
				}
			}

		}

	}

