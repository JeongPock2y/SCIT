package JAVA1006;

public class StringMethod {

	public static void main(String[] args) {
		String str = new String("Java");

		System.out.println("원본 문자열 : " + str);

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i) + " ");

		}

		System.out.println("\ncharAt() 메소드 호출 후 원본 문자열 : " + str);

//		원본 문자열 : Java
//
//		J a v a 
//
//		charAt() 메소드 호출 후 원본 문자열 : Java

		String str2 = new String("abcd");

		System.out.println("원본 문자열 : " + str2);

		System.out.println(str2.compareTo("bcef"));

		System.out.println(str2.compareTo("abcd") + "\n");

		System.out.println(str2.compareTo("Abcd"));

		System.out.println(str2.compareToIgnoreCase("Abcd"));

		System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str2);
//		원본 문자열 : abcd
//
//		-1
//
//		0
//
//		32
//
//		0
//		compareTo() 메소드 호출 후 원본 문자열 : abcd
		String str3 = new String("Java");

		System.out.println("원본 문자열 : " + str3);
		System.out.println(str3.concat("수업"));
		System.out.println("concat() 메소드 호출 후 원본 문자열 : " + str3);
//		원본 문자열 : Java
//
//		Java수업
//
//		concat() 메소드 호출 후 원본 문자열 : Java
	}

}
