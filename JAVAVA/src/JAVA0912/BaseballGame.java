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
		System.out.println("��ǻ�� ����");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		while (true) {
			System.out.println("1-9����(����) �Է� -->");
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
					System.out.println("�����մϴ�!!!!!!����");
					break;
				} else {
					System.out.println(strike + "��Ʈ����ũ " + ball + "��" + "�Դϴ�.");
					strike =0;
					ball=0;
				}
			}

		}

	}

