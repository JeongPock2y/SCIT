package JAVA0908;

public class Main3 {

	public static void main(String[] args) {
		int arr[] = { 11, 12, 13, 14, 25, 30, 54, 65, 68, 77 };
		System.out.print("원본 배열");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("복사본" + arr[i]);
		}

	}

}
