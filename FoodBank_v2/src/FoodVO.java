
public class FoodVO {
	private String foodName;						//���� �̸�
	private String foodType;						//���� ����
	private int foodCount;							//���� ����
	
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
		return "�����̸� : "+ this.foodName +" ���� ���� : "+this.foodType+" ���� ���� : "+this.foodCount;
	}
}
