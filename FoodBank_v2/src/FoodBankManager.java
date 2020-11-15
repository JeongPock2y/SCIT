
public class FoodBankManager {
	
	FoodVO[] fArray = new FoodVO[20];
	int count = 0;
	
	public void foodInsert(FoodVO fv) {
		fArray[count++] = fv;
	}
	
	public int getCount() {
		return count;
	}
	
	public FoodVO[] getList() {
		return fArray;
	}
	
	public int searchFoodName(String foodName) {
		int index = -1;
		for(int i=0; i < count; i++) {
			String checkName = fArray[i].getFoodName();
			if(foodName.equals(checkName)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int searchFoodCount(int index) {
		int count = fArray[index].getFoodCount();
		return count;
	}
	
	public void foodTake(int takeCount , int index) {
		fArray[index].setFoodCount(searchFoodCount(index)-takeCount);
	}
	
}
