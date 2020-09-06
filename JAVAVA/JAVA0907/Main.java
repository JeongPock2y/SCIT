package JAVA0907;

import java.util.Random;

public class Main {
//로또처럼  랜덤함수를 사용해서  1-45가지 수를 램덤으로 6개 출력하는거
	public static void main(String[] args) {
		Random rand = new Random();
		 int[] lotto = new int[6];
		 for(int i =0; i<6; i++ ) {
		 lotto[i]=rand.nextInt(45)+1;
		 }
		 for(int i =0; i<6; i++) {
			 System.out.printf("%d\t",lotto[i]);
		 }

	}

}
