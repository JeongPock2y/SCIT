package student.vo;

public class PersonVO {
	private int num;
	private String name;
	private int age;
	//기본생성자 는 자동으로 만들어져있음 하지만 꼭필요한것이다
	//기본생성자가 없으면 마이바티스에서 xml에서 객체가 생성이안된당. 주의할것
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
