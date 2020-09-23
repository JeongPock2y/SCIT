package JAVA0923;

public class StaticBlock {
	private static int i;
	
	static {
		i=100;
	}
	public static void main(String[] args) {
		System.out.println("i :"+StaticBlock.i);

	}

}
