package JAVA0910;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] iArrays = new int[3][5];
		
		int initVal = 0;
		for(int i=0; i< iArrays.length;i++) {
			for(int j =0; j< iArrays[i].length;j++) {
				iArrays[i][j] = initVal++;
			}
		}
		for(int i=0; i<iArrays.length;i++) {
			for(int j=0; j<iArrays[i].length;j++) {
				System.out.print("["+i+"]["+j+"]:"+
			iArrays[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
