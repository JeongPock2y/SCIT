import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		int n=1;//count
		int a=0;//input
		int sum=0;//합계저장
		Scanner sc = new Scanner(System.in);
		do {
			
		System.out.print(n+"번째 정수 입력(-1종료) :");
			a = sc.nextInt();
			sum +=a;
			n++;
		}while(a!=-1);
			sum= sum+1;
				System.out.println("총합"+sum);
			}
//	boolean key=true;
//	int k=0;
//	
//	while(key) {
//		System.out.println("숫자를 입력(-1로 종료): ");
//		int a = sc.nextInt();
//		
//		k = a != -1 ? k+a : k;
//		
//		if(a==-1) {
//			key=false;
//			System.out.println("총합: "+k);
//			System.out.println("종료");
//		}
//	}
			
	
			}
	


