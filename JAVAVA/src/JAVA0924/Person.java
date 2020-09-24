package JAVA0924;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setName(String name) throws NameException {
		if (name.length() < 5) {
			this.name = name;

		} else {
			throw new NameException();
		}
	}
}
