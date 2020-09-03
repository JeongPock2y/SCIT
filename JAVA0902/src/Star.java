
public class Star {

	
		public static void main(String[] args) {
			
			
			for( int i =0; i<5; i++) {
				for(int j =0; j<(9-i); j++) {//i¹ø ¹Ýº¹
					if(i>j) {
						System.out.print(" ");
					}else {
					System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
