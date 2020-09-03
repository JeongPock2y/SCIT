import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("점수 입력 : ");
		score = sc.nextInt();

		if( 0 < score && score < 101 ) {
			if ( score >= 90 ) {
				System.out.println("A 입니다");
			} else if ( score >= 80) {
				System.out.println("B 입니다");
			} else if ( score >= 70) {
				System.out.println("C 입니다");
			} else if ( score >= 60) {
				System.out.println("D 입니다");
			} else {
				System.out.println("F 입니다");
			}
		} else {
			System.out.println("점수를 재대로 입력 하세요");
		}
	}
