

public class FoodBankManager {

	Food[] fArray = new Food[20];
	int index = 0;

	public void insertFood(Food food) {
		fArray[index++] = food;
	}
	public Food[] listFood() {
		return fArray;
	}
	public int findFood(String takefoodName) {
		int temp = -1;
		for (int i = 0; i < index; i++) {
			if (takefoodName.equals(fArray[i].getFoodName())) {

				temp = i;
				break;
			}
		}
		return temp;

	}

	public int countFood(int temp) {
		int maxFoodCount = 0;
		if (temp != -1) {
			maxFoodCount = fArray[temp].getFoodCount();
		}
		return maxFoodCount;
	}
	
	
	public void substractFood(int temp, int takeFoodCount) {
		int subNum = fArray[temp].getFoodCount()-takeFoodCount;
		fArray[temp].setFoodCount(subNum);
	} 
	
	
	

	
}
