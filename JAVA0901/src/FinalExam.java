import java.util.Scanner;

public class FinalExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result =0;
		int score=0;
		
		for(int i =1;  i<=5; i++) {
			score = sc.nextInt();
			if(score%5!=0) {
				break;
			}
			if(score<40) {
				score =40;	
			}
				result+=score;
				
				
		}
			//System.out.println(result);
			System.out.println(result/5);
		
			
			
		
		}
	}


