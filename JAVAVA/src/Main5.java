import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n; i++) {
			
			sum += i;
			
		}
		System.out.println("1부터 "+n+"까지의 합계는 :"+sum);

	}

}
