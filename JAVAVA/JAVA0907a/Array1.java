package JAVA0907a;

// 정수형 배열 어레이 생성하는데 크기는 50
// 정수 1-100사이의 홀수를 배열에 저장해서 출력하는 코드
public class Array1 {

	public static void main(String[] args) {
		int num=0 ;
		int[] intArr = new int[50];
		for (int i = 1; i <= 100; i += 2) {

			intArr[num] = i;
			num++;
			
		}
		for (int k = 0; k < intArr.length; k++) {
			System.out.println("intArr[" + (k+1) + "]의 값은:" + intArr[k]);
		}

		
	}

}
