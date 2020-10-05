package HOMEWORK;
public class StringBuffer {

	public static void main(String[] args) {
		String str = "";
		StringBuffer buf = new StringBuffer();
		
		long start  = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str += "a";	
			//buf.append("a");
		}
		long end  = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		}
	}



