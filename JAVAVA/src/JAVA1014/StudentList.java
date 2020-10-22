package JAVA1014;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student("홍길동", 90));
		studentlist.add(new Student("이창원", 80));
		studentlist.add(new Student("정연욱", 100));
		System.out.println("***(1)***");
		for (int i = 0; i < studentlist.size(); i++) {
			System.out.println(studentlist.get(i));
			//System.out.println(studentlist.get(i).getName()+studentlist.get(i).getScore());
		}
		System.out.println("***(2)***");
		//for each 문  
		//해당하는 반복대상의 처음 부터 끝까지 하나씩 반복을한다.(멈추지않는한)
		for (Student s : studentlist) {//순서있는것만
			System.out.println(s);//studentlist를 student형태로 s에 집어넣어서 s를 출력
		}
	}

}
