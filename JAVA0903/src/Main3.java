import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		boolean ox;
		Scanner sc = new Scanner(System.in);
		System.out.print("출석");
		int a = sc.nextInt();
		System.out.print("it");
		int b = sc.nextInt();
		System.out.print("일본어");
		int c = sc.nextInt();
		double sum =(a*0.4+b*0.3+c*0.3);
		System.out.print("총점 :"+sum);
		if(sum>=70) {
			ox = true;
		}else {
			ox = false;
		}
		System.out.println("수료여부"+ox );
	}

}
