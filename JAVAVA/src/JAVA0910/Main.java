package JAVA0910;

public class Main {

	public static void main(String[] args) {
		int [][] arr = new int[2][3];
		
		arr[0][0] =10;
		arr[0][1]= 20;
		arr[0][2]= 30;
		arr[1][0]= 40;
		arr[1][1]= 50;
		arr[1][2]= 60;
		
		for(int i=0; i<arr.length;i++) {
				System.out.println();
			for(int j =0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
		}
		
		

	}

}
