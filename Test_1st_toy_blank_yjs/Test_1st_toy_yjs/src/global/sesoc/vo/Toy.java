
package global.sesoc.vo;

public class Toy {
	private String serialNum;
	private String name;
	private int price;
	
	public Toy() {
		// TODO Auto-generated constructor stub
	}

	public Toy(String serialNum, String name, int price) {
		super();
		this.serialNum = serialNum;
		this.name = name;
		this.price = price;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "장난감 [고유번호=" + serialNum + ", "
				+ "이름=" + name + ", 가격=" + price + 
				"]";
	}
	
}
