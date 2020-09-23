package JAVA0922;
//static 지정시  클래스 로딩때 같이 생성됨 따라서 객체를 생성하지않아도 소멸되어도사용가능 
public class MyClass {//맵버 변수는 객체가 만들어져야만 사용가능
	String name;
	int age;
	Boolean isMale;
	public MyClass() {
		
	}
	//처음에  기본값 0 null이아니라  처음에 newAge값을 정해서 넣을수있게 할수있음
	// 할인률?  만들어지면서 이미 가격이 있게 만들고싶어서
	//이렇게 생성자를 만들지 않으면 자동으로 기본생성자가 생성된다.
	public MyClass(String name) {
		this.name = name;
		System.out.println(name);
	}
	public MyClass(int age,String name) {
		this.age = age;
		this.name = name;	
		System.out.println(age+"\t"+name);
	}
	public MyClass(int age,String name,Boolean isMale) {
		
		this.age = age;
		this.name = name;
		this.isMale = isMale;
		System.out.println(age+"\t"+name+"\t"+isMale);
	}//생성자 오버로딩
}
