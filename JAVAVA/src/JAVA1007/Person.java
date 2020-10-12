package JAVA1007;
 class Person {
	 protected String name;
	 protected int age;
	
	 public Person(String n,int a ) {
		 name =n;
		 age =a;
	 }
	 public String printAll() {
		 return "Name :"+name+","+age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	 
}
