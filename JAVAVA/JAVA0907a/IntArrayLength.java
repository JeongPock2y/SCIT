package JAVA0907a;

public class IntArrayLength {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		
		intArr[0] = 11;
		intArr[1] = 22;
		intArr[2] = 33;
		
		System.out.println("값"+intArr.length);
		System.out.println();
		
		for(int i =0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
			if(intArr[i]==0) {
				System.out.println("0에 값을 넣어주세요 용사님");
				
			}
		}

	}

}
