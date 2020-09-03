import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
	int sum = 0;
	int n = 0;
		while (true) {
			++n;
			sum += n;    
			if (sum > 5000) {
			  break;
			}
		}      
		System.out.println("1 ~ " + n + "까지의 합계 : " + sum); 

	}

}
