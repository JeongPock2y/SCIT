package JAVA0907a;

public class Re {

	public static void main(String[] args) {
		int[] arr = new int[50];
		int num = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				arr[num] = i;
				num++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "¹øÂ°´Â :" + arr[i]);
		}
	}

}
