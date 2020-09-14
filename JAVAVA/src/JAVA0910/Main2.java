package JAVA0910;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		int i;
		Random ran = new Random();
		int[] arr = {10,20,30,40,50};
		for(i=1; i<=arr.length;i++) {
			arr[i] = ran.nextInt();
		}System.out.println(arr[i]);
		
		}
	}


