import java.util.Scanner;

public class FoodBankUI {
	Scanner sc = new Scanner(System.in);
	FoodBankManager manager = new FoodBankManager();
	
	public FoodBankUI() {
		while(true) {
			int menuNum=printMainMmenu();
			switch (menuNum) {
			case 1:
				insertFood();
				break;
			case 2:
				seeFood();
				break;
			case 3:
				getFood();
				
				break;
			case 4:
				System.out.println("system bye bye");
				return;
			default:
				System.out.println("입력이 잘못되었습니다.");
				break;
			}
		}
	}
	public int printMainMmenu() {
		System.out.println("==========");
		System.out.println("1.기부하기");
		System.out.println("2.목록보기");
		System.out.println("3.가져가기");
		System.out.println("4.종료");
		System.out.println("==========");
		System.out.print(">>>매뉴 번호 입력:");
		int menuNum = sc.nextInt();
		return menuNum;
	}
	public void insertFood() {
		sc.nextLine();
		System.out.println("기부하기 기능");
		System.out.print("음식 이름 : ");
		String foodName = sc.nextLine();
		System.out.print("음식 종류 : ");
		String foodType = sc.nextLine();
		System.out.print("음식 개수 : ");
		int foodCount = sc.nextInt();
		Food food = new Food(foodName, foodType, foodCount);
	}
	public void seeFood() {
		System.out.println("목록을 보여주세요");
		Food[] foodlist = new Food[20];
		for (int i = 0; i < foodlist.length; i++) {
			System.out.println(foodlist);
		}
	}
	public void getFood() {
		sc.nextLine();
		System.out.println("가져가기 기능");
		System.out.print("가져갈 음식이름 :");
		String takeFoodName = sc.nextLine();
		int temp =manager.findFood(takeFoodName);
		int maxFoodCount=manager.countFood(temp);
		System.out.print("최대 과일의 개수는"+maxFoodCount+"개  : ");
		int takeFoodCount = sc.nextInt();
			if (maxFoodCount < takeFoodCount) {
				System.out.println("최대 개수를 넘어서 가져갈 수 없습니다.");
			} else {
				manager.substractFood(temp,takeFoodCount);
				System.out.println(takeFoodName + "을" + takeFoodCount + "개" + "가져갔습니다.");
				
			}
		}
}


		
	

	

