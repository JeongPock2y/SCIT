package JAVA0907;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] timesTable;//참조변수
		timesTable = new int[8][9];
		int i,j;
		
		for( i =2; i<10; i++) {
			for(j=1; j<10; j++) {
				timesTable[i-2][j-1] =  i*j;  
				//0부터시작이라서 각각 i는 2 j는 1씩 빼주었다.
			}
		}
		for( i =2; i<10; i++) {
			for(j=1; j<10; j++) {
			System.out.println(i+"*"+j+"*"+timesTable[i-2][j-1]);
			if(j==9) {
				System.out.println(" ");
				
			  }
			}
			
			
		}
	}	

}
