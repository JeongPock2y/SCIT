import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 :");
		int n1 = sc.nextInt();
		System.out.print("둘 :");
		int n2 = sc.nextInt();
		
		int start =1;
		int sum =0;
		if(n1<0 || n2>n1) {
			System.out.println("No");
		}else {
			while(start <= n1) {
				if(start%n2 ==0) {
					start++;
					continue;
				}else {
					sum += start;
				}
				start++;
			}
			System.out.println("합계는 :"+sum);
		}
		
		}
		
	}

