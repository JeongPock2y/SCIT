import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("� ��");
		int m= sc.nextInt();
		int[] array = new int[m];
		
		for(int i =0; i<m; i++) {
			array[i]=sc.nextInt();
		}
		int max=array[0];
		int min=array[0];
		
		for(int j=0; j<m; j++) {
			if(max < array[j]) {
				max = array[j];
			}
		
			if(min > array[j]) {
				min = array[j];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
//int[] num = new int[10];
//
//
//
//for(int i = 0; i < num.length; i++){
//
//	
//
//	// 10���� ������ ������ ���� ����			
//
//	num[i] = (int)(Math.random()* 100);	
//
//	System.out.println(i + "��° �� ����" + num[i]);
//
//}
//
//


