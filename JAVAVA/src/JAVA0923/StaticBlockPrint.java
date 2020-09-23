package JAVA0923;

public class StaticBlockPrint {
	public  static  int  i;
	
	static {
		System.out.println("첫번째 static 블럭");
		i=10;
		
	}
	static {
		System.out.println("두번째 static 블럭");
		i =300;
	}
	static {
		System.out.println("3번째 static 블럭");
		i =500;
	}
}
