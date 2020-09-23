package JAVA0916;

import java.util.Scanner;

public class CalculatorExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.print("ㄱ국ㅂ숫자넣어 :");
		int num2 = sc.nextInt();
		System.out.println("덧결과="+cal.add(50, num2));
		System.out.println("뺄결과="+cal.minus(17, num2));
		System.out.println("곱결과="+cal.multiple(836, num2));
		System.out.println("눚결과="+cal.divide(775, num2));
		//근데 이렇게  프린트 메서드 안에  또다른 메서드를 넣는것은  간편하게할수는있으나
		//협업의 입장에서 는  안쓰는것이 좋다.

	}

}
