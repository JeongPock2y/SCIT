
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
	            System.out.print("�ϳ��� �����ϼ��� ����0����1��2"); 
	            
	            user=scan.nextInt(); 
	            if( com ==0){ 
	               System.out.println("��ǻ�Ͱ� ������ �����մϴ�."); 
	            } 
	            else if (com ==1){ 
	               System.out.println("��ǻ�Ͱ� ������ �����մϴ�"); 
	            } 
	            else if(com == 2){ 
	               System.out.println("��ǻ�Ͱ� ���� �����մϴ�."); 
	            } 
	            switch(user){ 
	               case 0: 
	               if( com ==0){ 
	                  System.out.println("��ǻ�Ͱ������ϴ�"); 
	               } 
	               else if (com ==1){ 
	                  System.out.println("��ǻ�Ͱ��̰���ϴ�"); 
	               } 
	               else if(com == 2){ 
	                  System.out.println("��ǻ�Ͱ������ϴ�"); 
	               } 
	               break; 
	               case 1: 
	               if( com ==0){ 
	                  System.out.println("��ǻ�Ͱ� �����ϴ�"); 
	               } 
	               else if (com ==1){ 
	                  System.out.println("��ǻ�Ͱ������ϴ�"); 
	               } 
	               else if(com == 2){ 
	                  System.out.println("��ǻ�Ͱ��̱�˽��ϴ�"); 
	               } 
	               break; 
	               case 2: 
	               if( com ==0){ 
	                  System.out.println("��ǻ�Ͱ��̱�̽��ϴ�"); 
	               } 
	               else if (com ==1){ 
	                  System.out.println("��ǻ�Ͱ����˽��ϴ�"); 
	               } 
	               else if(com == 2){ 
	                  System.out.println("��ǻ�Ͱ������ϴ�"); 
	               } 
	               break; 
	            } 
	         }
	      }
	}
}
	
		

