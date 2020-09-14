package JAVA0910;

public class Array_Lotto {
	public static void main(String[] args) {
		int lotto[] = new int [6];
		
     	  	
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 6) + 1;
            
       		  	
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	System.out.print("로또 번호: ");
	
  	 // 번호 출력
	for(int i=0; i<6; i++) {
		System.out.print(lotto[i] + " ");
	}	
	}
}


// 출력 결과 : "로또 번호: 1 19 17 38 33 31"