package ShoppingSuper;

abstract class Goods {
	// 추상 클래스의 필드 추가
	protected String name;
	protected int price;

	// 추상 클래스의 생성자
//	public Goods(String name, int price) {
//		this.name = name;
//		this.price = price;
//	}
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	//추상클래스의 toString 
//	public String toString() {
//		return String.format("%s: %.2f ", this.getClass().getSimpleName(),name,price);
//	}
	@Override
	public String toString() {
		return String.format("%s: %d원 ",name,price);
	}
	

	

	
}
