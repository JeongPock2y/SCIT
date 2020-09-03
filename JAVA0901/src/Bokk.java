import java.util.Scanner;

public class Bokk {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
		boolean key=true;
		int k=0;
		
		while(key) {
			System.out.println("숫자를 입력(-1로 종료): ");
			int a = sc.nextInt();
			
			k = a != -1 ? k+a : k;
			
			if(a==-1) {
				key=false;
				System.out.println("총합: "+k);
				System.out.println("종료");
			}
		}
	}

}
