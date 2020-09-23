package JAVA0921;

public class OverloadingTest {
	public int method(int a) {
		return  a+10;
	}
	public double method(double a) {
		return a+10;
	}

	public static void main(String[] args) {
		OverloadingTest over = new OverloadingTest();
		System.out.println(over.method(10));//매소드 이름이 같지만 파라매터의 형태에 맞춰 입력같에 알맞은 형태가 출력된다.
		System.out.println(over.method(1.414));

	}

}
