package JAVA0911;

public class BubbleSort {

	public static void main(String[] args) {
		int i,j;
		int temp;
		int[] a = {5,3,8,15,6,7};
		
		for(i=0;i<a.length; i++) {//phase ��  �ݺ����� ������
			for(j=0; j<a.length-1-i;j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;// phase1�� ���!
				}
			}
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		

	}

}
