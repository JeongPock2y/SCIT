package JAVA0908;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int value;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� :");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է��ϼ��� : ");
			value = sc.nextInt();
			
				sum += value;
				

			}System.out.print("�迭 ����� �� ���� :" + sum);
			
		}
	}


