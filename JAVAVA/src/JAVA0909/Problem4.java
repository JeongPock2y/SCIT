package JAVA0909;

public class Problem4 {

	public static void main(String[] args) {
		int arr[] = {29,37,12,45,60};
		
		for(int i=0; i<arr.length; i++) {
			if(i==3) {
				continue;
			}
			System.out.print(arr[i]+" ");
		}

	}

}
