package global.sesoc.vo;

public class Drone extends Toy {
	private int wingCount;
	public Drone() {
		// TODO Auto-generated constructor stub
	}
	public Drone(String serialNum, String name, int price, int wingCount) {
		super(serialNum, name, price);
		this.wingCount = wingCount;
	}
	public int getWingCount() {
		return wingCount;
	}
	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}
	@Override
	public String toString() {
		return super.toString()+ "드론 [날개 수=" + wingCount + "]";
	}
	
	

	
}
