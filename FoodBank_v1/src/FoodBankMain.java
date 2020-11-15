import java.util.Scanner;

public class FoodBankMain {

	public static void main(String[] args) {
		// 음식 등록 출력 업데이트

		Scanner sc = new Scanner(System.in);
		Food[] fArray = new Food[20];
		int index = 0;
		while (true) {
			System.out.println("==========");
			System.out.println("1.기부하기");
			System.out.println("2.목록보기");
			System.out.println("3.가져가기");
			System.out.println("4.종료");
			System.out.println("==========");
			System.out.print(">>>매뉴 번호 입력:");
			int menuNum = sc.nextInt();
//숫자에서 문자 입력으로 갈때   엔터 되는 게나오서  nextLine()으로 엔터 눌러줌
			switch (menuNum) {
			case 1:
				sc.nextLine();
				System.out.println("기부하기 기능");
				System.out.print("음식 이름 : ");
				String foodName = sc.nextLine();
				System.out.print("음식 종류 : ");
				String foodType = sc.nextLine();
				System.out.print("음식 개수 : ");
				int foodCount = sc.nextInt();
				Food food = new Food(foodName, foodType, foodCount);
				fArray[index++] = food;
				break;
			case 2:
				System.out.println("목록보기기능");
				for (int i = 0; i < index; i++) {
					System.out.println(fArray[i].toString());
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("가져가기 기능");
				System.out.print("가져갈 음식이름 :");
				String takeFoodName = sc.nextLine();
				int temp = -1;// 인덱스 표시해야하는데 0부터는 존재하니까
				// 같은음식찾았을때 인덱스 바꿔주려고 쓰는거라서 조건처리때문에 0안쓴거일뿐
				for (int i = 0; i < index; i++) {
					System.out.println(fArray[i].getFoodName());
					if (takeFoodName.equals(fArray[i].getFoodName())) {
						// 같은이름의 음식을 찾았다면
						temp = i;
						break;
					}

				}
				if (temp != -1) {
					int maxFoodCount = fArray[temp].getFoodCount();
					System.out.print("가져갈 음식 개수[최대" + maxFoodCount + "개] : ");
					int takeFoodCount = sc.nextInt();
					if (maxFoodCount < takeFoodCount) {
						System.out.println("최대 개수를 넘어서 가져갈 수 없습니다.");
					} else {
						fArray[temp].setFoodCount(maxFoodCount - takeFoodCount);
						System.out.println(takeFoodName + "을" + takeFoodCount + "개" + "가져갔습니다.");
						
					}
				}else {
					System.out.println("해당 음식이 없음니다.");
				}

				// 해당하는 음식의 최대개수를 사용자에게 전달하면서
				// 가져갈 음식 개수를 입력받을것
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
}
