package JAVA0900;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원 단위 금액 입력 :");
		int  won = sc.nextInt();//원
		if(won<0) {
			System.out.println("잘못 입력했습니다.");
		}else {
			System.out.println("환전할 화폐(1:달러, 2.엔화,3:유로화)");
			int menu = sc.nextInt();
			switch(menu) {
			case 1 : 
				double dollar = won*0.0082;
				System.out.println(won+"원 은"+dollar+"달러입니다.");
				break;
			case 2 : 
				double enn = won*0.08824;
				System.out.println(won+"원 은"+enn+"엔화입니다.");
				break;
			case 3 : 
				double euro = won*0.0078;
				System.out.println(won+"원 은"+euro+"유로화입니다.");
				break;
			default :
				System.out.println("잚소입력했어");
				
			}
			
		}
	}

}
