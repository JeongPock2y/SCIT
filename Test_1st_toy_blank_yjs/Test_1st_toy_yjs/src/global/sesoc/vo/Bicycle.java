package global.sesoc.vo;

public class Bicycle extends Toy{
	private String type;
	public Bicycle() {
		// TODO Auto-generated constructor stub
	}
	public Bicycle(String serialNum, String name, int price, String type) {
		super(serialNum, name, price);
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return super.toString()+"자전거 [종류=" + type + "]";
	}
	
}
