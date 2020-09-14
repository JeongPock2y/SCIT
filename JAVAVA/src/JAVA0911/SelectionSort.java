package JAVA0911;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {4,3,8,6,1,2};
		for(int i=1; i<arr.length;i++) {//회전수 담당  몇회전인지 i로 기준잡음
			for(int j=i; j>0; j--) {//핵심  각회전당 정렬담당
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
				}
			}
		}
		
		
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
