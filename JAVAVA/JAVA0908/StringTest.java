package JAVA0908;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; //정수형 변수를 선언
		String str;//문자열 변수를 선언
		
		System.out.print("정수를 입력해 주세요");
		num =sc.nextInt(); //선언된 정수형 변수에 3을 대입
		
		sc.nextLine();// 얘가  아래 출력에  정수가 나오는걸막아줌  enter
		System.out.print("문자열을 입력해주세요");
		str = sc.nextLine(); // 필요한 문구대입
		
		System.out.println(num);
		System.out.println(str);
	}

}
