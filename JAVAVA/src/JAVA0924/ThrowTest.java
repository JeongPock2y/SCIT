package JAVA0924;

public class ThrowTest {

	public static void main(String[] args) {
		try {
			summary();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static int divide(int n, int m) throws Exception {
		return n / m;// arthmetic 발생
	}

	public static void summary() throws Exception {// 서머리실행하다 에러뜨면 에러를 메인에 전가

		try {
			System.out.println("계산결과" + divide(10, 0));
		} catch (Exception e) {
			throw new Exception("계산오류");// 강제로 예외를 발생시킴
		}

	}

}
