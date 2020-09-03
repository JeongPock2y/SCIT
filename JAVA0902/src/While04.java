import java.util.Scanner;
public class While04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요 : ");
		int num2 = sc.nextInt();
		int start = 1;
		int sum = 0;

		if( num2 < 0 || num2 > num1 ){
			System.out.println("잘못 입력하셨습니다.");
		}else{
			while(start <= num1){
				if(start%num2 == 0){//배수냐?
					start++;
					continue;
				}else{
					sum += start;		
				}
				start++;
			}
			System.out.println("합계는 : "+sum);
		}

	}

}
