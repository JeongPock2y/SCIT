package JAVA0904;

import java.util.Scanner;

public class Hashad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("го╩Ч ют╥б");
		int input = sc.nextInt();
		
		
		int sum = 0;
		int input2 =input;
		
		while(true) {
			int temp= input2%10;
			sum +=temp;
			//sum += input2%10;
			input2 /=10;
			if(input2 ==0) {
				break;
			}
		}
		boolean result =false;
		if(input % sum ==0) {
			result= true;
		}
		System.out.println("го╩Ч:"+result );

	}

}
