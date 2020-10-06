package JAVA1006;

public class InheritanceTest {

	public static void main(String[] args) {
		Truck truck = new Truck(6, 3, 11.5);
		System.out.println("TRUCK의 바퀴의수는 :"
				+truck.numberOfWheel+"적재량은"+truck.maxLoad);
		
	}

}
