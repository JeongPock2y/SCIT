package JAVA0907a;
/*
 1~100까지 숫자가 입력될 때 한번이라도 입력되었으면 출력하시오.

입력 : 1 2 3 1 1 2 3 4 5 5

정답: 1 2 3 4 5

Tag 반복문 (while, for), if, 배열
 */
public class Array {
	public static void main(String[] args) {
		boolean arr[] = new boolean [101];
		int inArr[] = new int [101];
		inArr[0] = 1;
		inArr[1] = 2;
		inArr[2] = 3;
		inArr[3] = 1;
		inArr[4] = 1;
		inArr[5] = 2;
		inArr[6] = 3;
		inArr[7] = 4;
		inArr[8] = 5;
		inArr[9] = 5;
		inArr[10] = 7;
		inArr[11] = 15;
		
		// 1 2 3 4 5 7 15
		for (int i = 0; i <= 100; i++) {
			arr[inArr[i]] = true;
		}
		
		for (int i = 1 ; i <= 100; i++) {
			if (arr[i]) {
				System.out.print(i+ " ");
			}
		}
		
	}
}