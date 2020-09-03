import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year =0;
		int month = 0;
		int data= 0;
		int i;
		
		while (true) {
			System.out.println("연도 입력 : ");
			year = sc.nextInt();
			System.out.println("월 입력 : ");
			month = sc.nextInt();
			
			System.out.println();
			System.out.println("\t"+year+"년"+month+"월"+"\t");
			System.out.println("---------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토\t");
			System.out.println("---------------------------");
			
		}

	}

}
