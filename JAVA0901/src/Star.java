
public class Star {
		public static void main(String[] args) {
//			int i,j,k;
//			for( i=0; i<4; i++) {
//				for(j=3; j>=i; j--) {
//						System.out.print(" ");
//					}
//					for(k=0; k<=i;k++) {
//						System.out.print("*");
//					}
//					System.out.println();
//				}
//				
			
			for(int i =1; i<=4; i++) {//1234
				for(int j =4;j>=1;j--) {//4321
					if(i<j) {
						System.out.print(" ");
					}else
						System.out.print("*");
					
				}System.out.println();
			}
		}
	}


