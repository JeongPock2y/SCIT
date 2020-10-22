package JAVA1014;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("H");
		set.add("e");
		set.add("l");
		set.add("l");
		Iterator<String> itr=set.iterator();//반복가능한 형태로 데이터가나옴
		while (itr.hasNext()) {
			//hasNext() 가 itr 가  다음에 어떤데이터를 가지고있냐 의미?
			System.out.println(itr.next());
			//해즈 넥스트의 이름 자체가 다음에 가지고 있는게 있느냐 라고 묻는다는 뜻인거고 
			//불린값을 반환하는 메소드
		}
		System.out.println("---");
		System.out.println(set);
	}

}
