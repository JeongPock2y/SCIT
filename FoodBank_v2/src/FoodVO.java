
public class FoodVO {
	private String foodName;						//음식 이름
	private String foodType;						//음식 종류
	private int foodCount;							//음식 개수
	
	public FoodVO() {
	}

	public FoodVO(String foodName, String foodType, int foodCount) {
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodCount = foodCount;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
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
		return "음식이름 : "+ this.foodName +" 음식 종류 : "+this.foodType+" 음식 개수 : "+this.foodCount;
	}
}
