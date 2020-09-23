import java.util.Scanner;
public class MoneyChange {
//화폐 갯수 구하기
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int price, n50, n10, n5, n1, rest;
	System.out.print("상품가격을 입력하세요 : ");
		price = input.nextInt();
		rest = price;
		n50 = rest / 50000;
		rest = rest % 50000;
		n10 = rest / 10000;
		rest = rest % 10000;
		n5 = rest / 5000;
		rest = rest % 5000;
		n1 = rest / 1000;
		rest = rest % 1000;
		System.out.print(price + "원은 ");
		System.out.print("5만원권" + n50 + "장,");
		System.out.print("만원권"+ n10 +"장,");
		System.out.print("5천원권 " + n5 + "장, ");
		System.out.print("천원권 " + n1 + "장을 지불하고 ");
		System.out.println(rest + "원이 남습니다.");
		
	}
}
