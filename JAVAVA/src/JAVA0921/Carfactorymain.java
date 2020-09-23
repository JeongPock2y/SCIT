package JAVA0921;

import java.util.Scanner;

public class Carfactorymain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carfactory[] sArray = new Carfactory[10];
		int count = 0;
		int menu;

		while (true) {

			System.out.println("=====================");
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("0.종료");
			System.out.println("=====================");
			System.out.print("메뉴입력 --->");
			menu = sc.nextInt();

			switch (menu) {

			case 1:
				sc.nextLine();
				sArray[count] = new Carfactory();
				System.out.print("모델 이름 입력  :");
				sArray[count].setModelname(sc.nextLine());
				System.out.print("차량 색상을 입력  : ");
				sArray[count].setColor(sc.nextLine());
				System.out.print("차량 넘버입력  :");
				sArray[count].setSerial(sc.nextInt());
				System.out.print("연비를 입력   :");
				sArray[count].setMileage(sc.nextInt());
				System.out.print("갈 거리를 입력   :");
				sArray[count].setDistance(sc.nextInt());
				count++;
				break;
			case 2:
				for(int i=0; i<count; i++) {
					Carfactory c = sArray[i];
					System.out.println(c.getModelname()+"은 "+c.getColor()+"색 이며 "
					+c.getSerial()+" 번호의 차량으로 지금까지  "+c.getTotalDistance()+"KM 만큼 갔습니다. ");
				}
				
			case 0:
				System.exit(0);
				break;

			}

		}

	}
}
