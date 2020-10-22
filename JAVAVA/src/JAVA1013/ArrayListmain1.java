package JAVA1013;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListmain1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list.get(3));
		System.out.println("--------");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(8);
		list1.add(3);
		list1.add(2);
		list1.add(5);
		list1.add(4);
		for (int i = 0; i < list1.size(); i++) {
			if(list1.get(i)==2) {
				
				System.out.println(i);
				break;
			}
		}

		System.out.println("--------");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(20);//0
		list2.add(25);//1
		list2.add(30);
		list2.add(10);
		list2.add(15);
		list2.add(5);
		int index = sc.nextInt();//0
		int index1 = sc.nextInt();//1
		int temp = list2.get(index);
		list2.set(index,list2.get(index1));//index번째 인뎃스에 list2.get(index1)의값을 넣어줌
		list2.set(index1,temp);//temp값을 index1번째 인덱스에 넣음
		//즉 둘이 index 번째 인덱스와 index1번째 인덱스교환
		for (int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("--------");

		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		list3.add(5);
		list3.add(3);
		list3.add(6);
		list3.add(7);
		list3.add(2);
		list3.add(4);
		list3.add(8);
		int max = list3.get(0);
		int min = list3.get(0);
		for (int K = 0; K < list3.size(); K++) {
//			if (K == 0) {
//				max = list3.get(K);
//				min = list3.get(K);
//			}
			if (max < list3.get(K)) {
				max = list3.get(K);
			}
			if (min > list3.get(K)) {
				min = list3.get(K);
			}
		}
		System.out.println("최댓값은 : " + max);
		System.out.println("최솟값은 : " + min);
		
	}
	
}
