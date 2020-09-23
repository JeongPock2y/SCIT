import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int a;
		
		while(true) {
			
			 
			System.out.print("정수 입력 : ");
			a = sc.nextInt();
			
			if(a!=0) {
				if(a%3==0) {
					cnt++;
				}
				
			}else {
				break;
			}	
		}
		System.out.println(cnt);
	}

}
