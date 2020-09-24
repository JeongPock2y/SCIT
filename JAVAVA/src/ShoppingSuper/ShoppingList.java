package ShoppingSuper;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		// create Goods object
		Goods monitor = new Monitor("FHD 와이드 모니터", 450000);
		Goods tv = new TV("SK 벽걸이 TV", 2350000);
		Goods computer = new Computer("노트북 고급형", 1650000);
		// add in cart
		ArrayList<Goods> cart = new ArrayList<Goods>();
		//Goods(부모이자 추상클래스)를  Arraylist담게 되면  자식클래스인 (tv,monitor,computer)을 다담을수있음
		cart.add(monitor);
		cart.add(tv);
		cart.add(computer);

		// print contents of cart
		for (Goods g : cart) {
			System.out.println(g.toString());
		}

	}

}

