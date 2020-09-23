package JAVA0922;

public class CountTest {

	public static void main(String[] args) {
		Count c1 =  new Count();
		Count c2 =  new Count();
		Count c3 =  new Count();
		
		System.out.println("c1.serialNumber :"+c1.serialNumber);
		System.out.println("c2.serialNumber :"+c2.serialNumber);
		System.out.println("c3.serialNumber :"+c3.serialNumber);
		//static 선언된 클래스 변수는 클래스의 이름으로 접근 가능하다.
		System.out.println("Count.counter : "+ Count.counter);
		//멤버변수처럼 객체의 이름으로도 접근이 가능하다.
		System.out.println("c2.counter :"+ c2.counter);
		
		//아래두가지의 경우  객체를 안만들고 클래스이름으로 써도되고
		// 클래스 생성후 아래처럼써도 가능하다
	}

}
