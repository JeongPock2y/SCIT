package JAVA0908;

public class Main3 {

	public static void main(String[] args) {
		int arr[] = { 11, 12, 13, 14, 25, 30, 54, 65, 68, 77 };
		
		int arr2[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i]= arr[i];
		}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
