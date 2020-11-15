import java.util.Scanner;

public class FoodBankUI {
	Scanner sc = new Scanner(System.in);
	FoodBankManager mgr = new FoodBankManager();
	
	public FoodBankUI() {
		
		while(true) {
			int menuNum = printMainMenu();
			
			switch (menuNum) {
				case 1:
					 foodInsert();
					break;
				case 2:
					foodInfoPrint();
					break;
				case 3:
					foodTake();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("잘못 입력하셨습니다. ");
					break;
			}
			
		}
		
	}
	
	public int printMainMenu() {
		System.out.println("==================");
		System.out.println("[ 메뉴 출력 ]");
		System.out.println("==================");
		System.out.println("1. 기부하기");
		System.out.println("2. 목록보기");
		System.out.println("3. 가져가기");
		System.out.println("4. 종료");
		System.out.println("==================");
		System.out.print("입력 : ");
		int menuNum = sc.nextInt();
		return menuNum;
	}
	
	public void foodInsert() {
		sc.nextLine();							//스캐너 초기화
		String foodName;						//음식 이름
		String foodType;						//음식 종류
		int foodCount;							//음식 개수
		
		System.out.println("==================");
		System.out.println("[음식 기부 등록]");
		System.out.println("==================");
		System.out.print("음식 이름 : ");
		foodName = sc.nextLine();
		System.out.print("음식 종류 : ");
		foodType = sc.nextLine();
		System.out.print("음식 개수 : ");
		foodCount = sc.nextInt();
		
		FoodVO fv = new FoodVO(foodName, foodType, foodCount);
		mgr.foodInsert(fv);
		System.out.println("음식 기부가 되었습니다.");
	}
	
	public void foodInfoPrint() {
		System.out.println("==================");
		System.out.println("[기부 목록 보기]");
		System.out.println("==================");
		
		FoodVO[] fArray = mgr.getList();
		int count = mgr.getCount();
		
		for(int i=0; i < count; i++) {
			System.out.println(fArray[i]);
		}
	}
	
	public void foodTake() {
		sc.nextLine();							//스캐너 초기화
		System.out.println("==================");
		System.out.println("[음식 가져가기]");
		System.out.println("==================");
		System.out.print("가져갈 음식 이름 : ");
		String foodName = sc.nextLine();
		
		int index = mgr.searchFoodName(foodName);
		
		if(index != -1) {
			int maxCount = 0;
			int takeCount = 0;
			
			while(true) {
				maxCount = mgr.searchFoodCount(index);
				System.out.print("가져갈 음식 개수[최대 "+maxCount+"개] : ");
				takeCount = sc.nextInt();
				if(maxCount < takeCount) {
					System.out.println("최대 개수를 초과하여 가져갈 수 없습니다.");
				} else {
					break;
				}
			}
			mgr.foodTake(takeCount, index);
			System.out.println(foodName+"을 "+takeCount+"개 가져갔습니다.");
		} else {
			System.out.println("해당 이름의 음식이 없습니다.");
		}
	}
	
}
