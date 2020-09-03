
import java.util.Random;
import java.util.Scanner;

public class rps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int com;
	      int user;
	      String userString; 
	      int cont_num =0; 
	      Random rand = new Random(); 
	      Scanner scan = new Scanner(System.in); 
	      while(cont_num == 0){ 
	         for(int i=0; i<1; i++){ 
	            com =rand.nextInt(3); 
	            System.out.print("하나를 선택하세요 가위0바위1보2"); 
	            
	            user=scan.nextInt(); 
	            if( com ==0){ 
	               System.out.println("컴퓨터가 가위를 선택합니다."); 
	            } 
	            else if (com ==1){ 
	               System.out.println("컴퓨터가 바위를 선택합니다"); 
	            } 
	            else if(com == 2){ 
	               System.out.println("컴퓨터가 보를 선택합니다."); 
	            } 
	            switch(user){ 
	               case 0: 
	               if( com ==0){ 
	                  System.out.println("컴퓨터가비겼습니다"); 
	               } 
	               else if (com ==1){ 
	                  System.out.println("컴퓨터가이겼습니다"); 
	               } 
	               else if(com == 2){ 
	                  System.out.println("컴퓨터가졋습니다"); 
	               } 
	               break; 
	               case 1: 
	               if( com ==0){ 
	                  System.out.println("컴퓨터가 졌습니다"); 
	               } 
	               else if (com ==1){ 
	                  System.out.println("컴퓨터가비겼습니다"); 
	               } 
	               else if(com == 2){ 
	                  System.out.println("컴퓨터가이기셧습니다"); 
	               } 
	               break; 
	               case 2: 
	               if( com ==0){ 
	                  System.out.println("컴퓨터가이기셨습니다"); 
	               } 
	               else if (com ==1){ 
	                  System.out.println("컴퓨터가지셧습니다"); 
	               } 
	               else if(com == 2){ 
	                  System.out.println("컴퓨터가비겼습니다"); 
	               } 
	               break; 
	            } 
	         }
	      }
	}
}
	
		

