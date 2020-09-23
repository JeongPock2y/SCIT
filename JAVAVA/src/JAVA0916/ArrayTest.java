package JAVA0916;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("55");
		al.add(3, "hello");// 앞에  숫자는 그 배열 위치
		
		
//		for(int i=0; i<al.size(); i++) {
//			String value = al.get(i);
//			System.out.println(value);
//			//몇개의 값이 들어가든 상관없다는점  미리 지정해주지 않아도 된자는 점이  기존 배열과는 다르다
//			// 가지고 올때는 get()
//		}
//		
		
		for (String string : al) {
			System.out.println(string.toString());
		}
	}

}
