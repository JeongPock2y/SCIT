package Tour.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Tour.mgr.TourManager;
import Tour.vo.Castle;
import Tour.vo.Park;
import Tour.vo.TourArea;

/**
 * �Խ��� ���α׷��� ����� ȭ��
 */
public class TourUI {
	// static int languageNum = 0;
	Scanner sc = new Scanner(System.in);
	TourManager manager = new TourManager();

	/**
	 * ������
	 */
	public TourUI() {
		int menuNum = 0;

		while (true) {
			printMainMenu();
			try {
				menuNum = sc.nextInt();
				switch (menuNum) {
				case 1:add();break;
				case 2:read();break;
				case 3:delete();break;
				case 4:update();break;
				case 0:System.out.println("�̿����ּż� �����մϴ�.");
						return;
				default:
					System.out.println("[����] �ٽ� �����ϼ���.");
				}
			} catch (Exception e) {
				System.out.println("[����] �Է������� �߸��Ǿ����ϴ�.");
				sc.nextLine();
			}
		}
	}



	/**
	 * ���� �޴��� ����Ѵ�.
	 */
	public void printMainMenu() {

		System.out.println();
		System.out.println("  *�������� ���� �˾ƺ���!!* ");
		System.out.println("��\t1. ������ �Է�\t\t��");
		System.out.println("��\t2. ������ ���\t\t��");
		System.out.println("��\t3. ������ ����\t\t��");
		System.out.println("��\t4. ������ ����\t\t��");
		System.out.println("��\t0. ���α׷� ����\t\t��");
		System.out.print("** ��ȣ ���� > ");
	}

	public void add() {
		Castle c=null;
		System.out.println();
		System.out.println("--������ ����---");
		System.out.println("1. ��");
		System.out.println("2. ����");
		System.out.print("����� Ÿ���� ����ּ���>>");
		int inum = sc.nextInt();
		switch (inum) {
		case 1:
			sc.nextLine();
			System.out.print("�̸��� �Է�>>>");
			String area_name = sc.nextLine();
			System.out.print("������� �Է�>>>");
			int fee = sc.nextInt();
			System.out.print("�������۽ð��� �Է�>>>");
			int starttime = sc.nextInt();
			System.out.print("���� ����ð��� �Է�>>>");
			int closetime = sc.nextInt();
			System.out.print("����ö �뼱�� �Է�(1-3ȣ��)>>>");
			int subwayLine = sc.nextInt();
			System.out.print("������ ��(��)��>>>");
			int birth = sc.nextInt();
			sc.nextLine();
			System.out.print("����� �ô��� ���̸�>>>"); 
			String king = sc.nextLine();
			 c = new Castle(area_name, fee, starttime, closetime, subwayLine, birth, king);
		 
	boolean InsertCastle = manager.insertCastle(c);
	if (InsertCastle) {
		System.out.println("���� ����");
	}else {
		System.out.println("���� ����");
	}
	break;
case 2:
	Park p =new Park();
	sc.nextLine();
	System.out.print("�̸��� �Է�>>>");
	area_name = sc.nextLine();
	//p.setarea_name(sc.nextLine());
	System.out.print("������� �Է�>>>");
	fee = sc.nextInt();
	//p.setFee(sc.nextInt());
	System.out.print("�������۽ð��� �Է�>>>");
	starttime = sc.nextInt();
	//p.setStarttime(sc.nextInt());
	System.out.print("���� ����ð��� �Է�>>>");
	closetime = sc.nextInt();
	//p.setClosetime(sc.nextInt());
	System.out.print("����ö �뼱�� �Է�(1-3ȣ��)>>>");
	subwayLine = sc.nextInt();
	//p.setSubwayLine(sc.nextInt());
	sc.nextLine();
	System.out.print("��ġ(�ּ�)�� �Է��� �ּ���>>"); 
	String location = sc.nextLine();
	//p.setLocation(sc.nextLine());
	System.out.print("������ �������� ������ �Է����ּ���>>> ");
	int manageOffice = sc.nextInt();
	//p.setManageoffice(sc.nextInt());
	p= new Park(area_name, fee, starttime, closetime, subwayLine, location, manageOffice);
	
			
	   
	  boolean InsertPark =manager.insertPark(p);
	  if (InsertPark) {
		System.out.println(" ����");
	}else {
		System.out.println("����");
	}
	 
			break;
	
		default:
			System.out.println("kjfdsklfj");
			break;
		}

}
	public void read() {
		System.out.println("���� ���(1.castel//2.park)");
		int num = sc.nextInt();
		ArrayList<HashMap<String, Object>> list = manager.listAll(num);
		
		for(HashMap<String, Object> map : list) {
			System.out.print("�̸� :"+map.get("AREA_NAME")+"\t");
			System.out.print("��� :"+map.get("FEE")+"\t");
			System.out.print("���� :"+map.get("STARTTIME")+"\t");
			System.out.print("�� :"+map.get("CLOSETIME")+"\t");
			if (num==1) {
				System.out.print("���� :"+map.get("BIRTH")+"\t");
				System.out.println("�� :"+map.get("KING")+"\t");
			}else if (num==2 ) {
				System.out.print("��� :"+map.get("LOCATION")+"\t");
				System.out.println("������ :"+map.get("MANAGEOFFICE")+"\t");
				
			}
		}
	}
		

	void delete() {
		String area_name = null;
		sc.nextLine();
		System.out.println();
		System.out.println("[ ������ ���� ���� ]");
		System.out.print("** ������ ��� �̸� > ");
		area_name = sc.nextLine();
		boolean res = manager.deleteTour(area_name);
		if (res) {
			System.out.println("[����] �����Ǿ����ϴ�.");
		} else {
			System.out.println("[����] ���� ����� �������� �ʽ��ϴ�.");
		}
	}
	
	public void update() {
		sc.nextLine();
		
		System.out.println("[ ������ ���� ���� ]");
		System.out.print("** ������ ��� �̸� > ");
		String area_name  = sc.nextLine();
		
		System.out.println("������ ��� >");
		int fee = sc.nextInt();
		System.out.println("������ ���� �ð�> ");
		int starttime = sc.nextInt();
		System.out.println("������ ���� �ð�>");
		int closetime = sc.nextInt();
		System.out.println("������ ����ö �뼱>");
		int subwayLine = sc.nextInt();
		TourArea tourarea = new TourArea(area_name, fee, starttime, closetime, subwayLine);
		boolean res = manager.updateTour(tourarea);
		if (res) {
			System.out.println("[����] ����");
		} else {
			System.out.println("[����] ��2��2");
		}
	}

}
