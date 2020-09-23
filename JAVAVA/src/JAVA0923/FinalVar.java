package JAVA0923;

public class FinalVar {
	final int i = 9;
	public static final String  GENDER_CODE = "M01";
	//누구나  공유   변하지않는  문자열
	public void go() {
		// final
		//i =10;
		System.out.println(i);
	}
	public static void main(String[] args) {
		FinalVar fv  = new FinalVar();
		fv.go();
	}

}