package JAVA0921;

public class Accesname {

	public static void main(String[] args) {
		AccessModifier ac = new AccessModifier();
		ac.age =30;
		System.out.println(ac.age);//직접접근
		
		int getAge = ac.getAge();//간접접근은 쌉가
		System.out.println(getAge);

	}

}
