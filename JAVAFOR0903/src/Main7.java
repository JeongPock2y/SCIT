import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double won = 1000;  //1000원
		double dollar = 0.82; //1000원 -> 달러
		double yen = 88.24;  //1000원 -> 엔화
		double euro = 0.78;  //1000원 -> 유로화

		int choice;   
		int incur;
		double outcur;    

		System.out.print("원 단위 금액 입력 : ");
		incur = input.nextInt();  

		if (incur < 0) {
			System.out.println("잘못 입력했습니다.");    
			System.exit(0);   
		}      

		System.out.print("환전할 화폐 (1:달러, 2:엔화, 3:유로화) : ");   
		choice = input.nextInt(); 

		switch (choice) {
			case 1:
				outcur = incur * dollar / won;
				System.out.println(incur + "원은 " + outcur + "달러입니다.");
				break;    
			case 2:     
				outcur = incur * yen / won;
				System.out.println(incur + "원은 " + outcur + "엔입니다.");
				break;    
			case 3:     
				outcur = incur * euro / won;     
				System.out.println(incur + "원은 " + outcur + "유로입니다.");
				break;    
			default:      
				System.out.println("잘못 입력했습니다.");
		}
