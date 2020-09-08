package JAVA0908;

public class Main1 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int a=0;
		for(int i =1; i<=arr.length;i++) {
			arr[a] = i;
			a++;
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
