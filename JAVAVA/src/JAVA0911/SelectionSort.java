package JAVA0911;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {4,3,8,6,1,2};
		for(int i=1; i<arr.length;i++) {//ȸ���� ���  ��ȸ������ i�� ��������
			for(int j=i; j>0; j--) {//�ٽ�  ��ȸ���� ���Ĵ��
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
