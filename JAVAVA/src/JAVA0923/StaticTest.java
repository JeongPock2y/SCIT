package JAVA0923;

public class StaticTest {
	int i =10;
	
	public void go() {
		int i=1;
		System.out.println(this.i);
		System.out.println(i);
	}
	public static int goStatic() {
		//this.i =10;//참조불가
		int j =2;//생성 가능 참조만안된다는의미
		System.out.println(j);
		return j;
		
	}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.go();
		System.out.println(goStatic());//첫2는  메소드 실행값이고  리턴받아서 여기 gostatic이 2로 리턴받아서
		//2가 두번찍히게됨
		//System.out.println(go());
		//System.out.println(this.i);

	}

}
