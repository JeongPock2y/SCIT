package JAVA0907;

class Person {
	int age;
	String name;

	public Person(int newAge, String newName) {
		age = newAge;
		name = newName;

	}

	public String PrintAll() {
		return "Peron [age = " + age + ",name=" + name + "]";
	}

}

public class ArrayTest {
	public static void main(String[] args) {

		Person[] pArray = new Person[3];

		pArray[0] = new Person(10, "soft");
		pArray[1] = new Person(20, "Engineer");
		pArray[2] = new Person(30, "Society");
		System.out.println(pArray[0].name + pArray[1].name + pArray[2].name);

		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].PrintAll());
		}
	}
}
