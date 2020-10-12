package JAVA1012;

public class FruitBox<T> {
	private T object;
	
	public  T get() {
		return object;
	}
	public void set(T obj) { 
		object =obj;
	}
	public static void main(String[] args) {
		FruitBox<Apple> box =new FruitBox<Apple>();
		box.set(new Apple());
		System.out.println(box.get().getName());
		FruitBox<Grape> box1 =new FruitBox<Grape>();
		box1.set(new Grape());
		System.out.println(box1.get().getName());
	}
}
