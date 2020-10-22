package JAVA1013;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//0
		list.add("둘리 ㅎㅇ");
		//1
		list.add("도우너 어서오고");
		//2
		list.add("길동이 씌발 새끼");
		//3
		list.add("꼴받게 하네");
		//4
		list.add("희동이 호로자식 되는꼴 싶어?");
		//5
		//list.remove(3);
		list.set(3, "얘들아 제발 이집에서 나가줘");
		
		System.out.println(list.size());//6개에서 1개지워서 size :5개
		for (String string : list) {
			System.out.println(string);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
