package JAVA0900;
import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 :");
		int score = sc.nextInt();
		if(score>=90) {
			System.out.println("a입니다");
		}else if(score >=80) {
			System.out.println("b입니다");
		}else if(score >=70) {
			System.out.println("c입니다");
		}else if(score >=60) {
			System.out.println("d입니다");
		}else {
			System.out.println("f입니다");
		}
		
		
		
	}

}
