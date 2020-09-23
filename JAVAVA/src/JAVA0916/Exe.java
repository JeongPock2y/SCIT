package JAVA0916;

import java.util.Scanner;

public class Exe {
	public static void main(String[] args) {
		try {
			yourFace();
		} catch (Exception e) {
			System.out.println("응~~ 아니야");
		}
	}
	public static void yourFace() throws Exception {
		String answer;
		System.out.println("------------");
		System.out.println("너는 누구니?  :");
		System.out.println("------------");
		Scanner sc = new Scanner(System.in);
		answer = sc.nextLine();
		if(answer.equals("정연욱")) {
			throw new brainException(answer);
		}else {
			System.out.println("남자");
		}
	}
}

	
		
	


