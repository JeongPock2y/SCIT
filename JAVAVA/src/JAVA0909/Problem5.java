package JAVA0909;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		for(i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println(sum);
		System.out.println((double)sum/(double)a.length);
	}

}
