package JAVA0924;

public class NameExceptionTest {

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person();

		try {
			p.setName("이철수");
			p1.setName("다나카타로우");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
