package JAVA0909;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int [] callCount = new int[23];
		Scanner sc=  new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=0; i<count;i++) {
			int no = sc.nextInt();
			callCount[no -1]++;
			
		}
		for(int i=0; i< callCount.length;i++) {
			System.out.printf("%d", callCount[i]);
		}

	}

}
