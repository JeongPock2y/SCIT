package JAVA0922;

public class MyClassTest {

	public static void main(String[] args) {
		//MyCalss mc2 = new MyCalss( ); 기본생성자는  myclass에 없으니 에러남
		MyClass mc  = new MyClass();
		MyClass mc1 = new MyClass("정연욱");
		MyClass mc2 = new MyClass(28,"정연욱");
		MyClass mc3 = new MyClass(28,"정연욱",true);
		
	}

}
