package JAVA0909;

public class Main2 {

	public static void main(String[] args) {
		int N = 50;
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = (int) (Math.random() * 10);// 0-9까지만

			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
//2500개  50*50 random 2차원 배열
	}

}
