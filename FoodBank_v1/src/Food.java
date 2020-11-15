
public class Food {
	//접근지정자 private
	private String foodName;
	private String foodType;
	private int foodCount;
	
	//생성자  
	public Food(String foodName, String foodType, int foodCount) {
		super();//없어도 자동으로 실행되는데 명시적으로쓴거   부모클래스라는 증거
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodCount = foodCount;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
		// 맴버변수                 입력받은 이름
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFoodCount() {
		return foodCount;
	}

	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}

	@Override
	public String toString() {
		return " [foodName=" + foodName + ", foodType=" + foodType + ", foodCount=" + foodCount + "]";
	}


	
	
	
	
}
