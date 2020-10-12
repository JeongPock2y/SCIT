package JAVA1007;

public class Student extends Person {
	protected String no;

	public Student(String name, int age, String no) {
		// 부모클래스의 기본생성자를 호출하는것이 숨겨져 있다.
		// 강제적으로 부모클래스의 하나를 실행하면 기본생성자를 호출하는것이 샐행되지 않는
		super(name, age);// 부모가 가지고있는 생성자중 하나라도 생성하면
		this.no =no;

	}

	public String printAll() {
		 return "Name :"+name+"는"+age+no+"입니다.";
	}

}
