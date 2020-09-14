package JAVA0912;

import java.util.*;

public class Baseball2 {

	public static void main(String[] args) {

		int com[] = new int[3]; // 컴퓨터의 배열 3개
		int user[] = new int[3]; // 사용자의 배열 3개
		int ch = 0;
		int counter = 0;

		boolean randomball = true;

		while (randomball) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;//1-9
 
			}
			if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2])
// 숫자를 만드는데 3자리 숫자가 다 다르게해서 while문을 탈출할 수 있도록 
			{
				randomball = false;
			}
		}
		System.out.println("야구게임 시작");
		randomball = true;
		while (randomball) {
			int strike = 0;
			int ball = 0;
			System.out.println("숫자를 입력하세요");
			Scanner kk = new Scanner(System.in);

			for (int i = 0; i < user.length; i++) {
				try {
					ch = kk.nextInt();
					user[i] = ch;
					if (ch > 10 || ch < 0) {
						System.out.println("1~9의 숫자를 입력하세요");
					}
				} catch (Exception e) {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			for (int i = 0; i < com.length; i++) // 컴퓨터배열(숫자)과 사용자배열(숫자)을 비교함
			{
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) // 배열이(숫자)같고 위치까지 같으면 스트라이크
					{
						strike++;
					} else if (com[i] == user[j] && i != j) // 배열이(숫자)같고 위치가 다르면 볼
					{
						ball++;
					}

				}
			}
			System.out.println(strike + "스트라이크  " + ball + "볼");
			if (strike == 3) // 스트라이크가 세개는 맞췄다는 뜻이니깐 빠져나갈 수 있도록
			{
				randomball = false;
			}
			counter++;
		}
		System.out.println("횟수 : " + counter);
		System.out.println("게임 끝");
	}
}