
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품의 가격을 입력 :");
		int a = sc.nextInt();
		System.out.print("제품의 구매가 입력 :");
		int b = sc.nextInt();
		System.out.println("할인율은 :"+(a-b)/((double)a)*100+"%");
	}

}
