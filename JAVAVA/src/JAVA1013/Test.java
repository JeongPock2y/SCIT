package JAVA1013;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("정연욱");
		list.add("수지");
		list.add("아이유");
		//list값을 iterator 메소드에 저장해서 차례대로 호출
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
