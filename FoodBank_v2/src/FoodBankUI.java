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
					System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
					break;
			}
			
		}
		
	}
	
	public int printMainMenu() {
		System.out.println("==================");
		System.out.println("[ �޴� ��� ]");
		System.out.println("==================");
		System.out.println("1. ����ϱ�");
		System.out.println("2. ��Ϻ���");
		System.out.println("3. ��������");
		System.out.println("4. ����");
		System.out.println("==================");
		System.out.print("�Է� : ");
		int menuNum = sc.nextInt();
		return menuNum;
	}
	
	public void foodInsert() {
		sc.nextLine();							//��ĳ�� �ʱ�ȭ
		String foodName;						//���� �̸�
		String foodType;						//���� ����
		int foodCount;							//���� ����
		
		System.out.println("==================");
		System.out.println("[���� ��� ���]");
		System.out.println("==================");
		System.out.print("���� �̸� : ");
		foodName = sc.nextLine();
		System.out.print("���� ���� : ");
		foodType = sc.nextLine();
		System.out.print("���� ���� : ");
		foodCount = sc.nextInt();
		
		FoodVO fv = new FoodVO(foodName, foodType, foodCount);
		mgr.foodInsert(fv);
		System.out.println("���� ��ΰ� �Ǿ����ϴ�.");
	}
	
	public void foodInfoPrint() {
		System.out.println("==================");
		System.out.println("[��� ��� ����]");
		System.out.println("==================");
		
		FoodVO[] fArray = mgr.getList();
		int count = mgr.getCount();
		
		for(int i=0; i < count; i++) {
			System.out.println(fArray[i]);
		}
	}
	
	public void foodTake() {
		sc.nextLine();							//��ĳ�� �ʱ�ȭ
		System.out.println("==================");
		System.out.println("[���� ��������]");
		System.out.println("==================");
		System.out.print("������ ���� �̸� : ");
		String foodName = sc.nextLine();
		
		int index = mgr.searchFoodName(foodName);
		
		if(index != -1) {
			int maxCount = 0;
			int takeCount = 0;
			
			while(true) {
				maxCount = mgr.searchFoodCount(index);
				System.out.print("������ ���� ����[�ִ� "+maxCount+"��] : ");
				takeCount = sc.nextInt();
				if(maxCount < takeCount) {
					System.out.println("�ִ� ������ �ʰ��Ͽ� ������ �� �����ϴ�.");
				} else {
					break;
				}
			}
			mgr.foodTake(takeCount, index);
			System.out.println(foodName+"�� "+takeCount+"�� ���������ϴ�.");
		} else {
			System.out.println("�ش� �̸��� ������ �����ϴ�.");
		}
	}
	
}
