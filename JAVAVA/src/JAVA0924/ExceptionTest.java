package JAVA0924;


public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 5;
			System.out.println("start");
			System.out.println(a / b);
			int ary[] = null;
			ary[0] = 1;
			System.err.println("End");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}

}
