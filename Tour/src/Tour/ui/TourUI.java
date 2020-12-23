package Tour.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Tour.mgr.TourManager;
import Tour.vo.Castle;
import Tour.vo.Park;
import Tour.vo.TourArea;


public class TourUI {

	Scanner sc = new Scanner(System.in);
	TourManager manager = new TourManager();

	

	public TourUI() {
		int menuNum = 0;

		while (true) {
			printMainMenu();
			try {
				menuNum = sc.nextInt();
				switch (menuNum) {
				case 1:add();break;
				case 2:read();break;
				case 3:update();break;
				case 4:delete();break;
				case 0:System.out.println("ご利用ありがとうございます");
						return;
				default:
					System.out.println("[ERROR] をもう一度選択してください。");
				}
			} catch (Exception e) {
				System.out.println("[ERROR] 入力形式が正しくありません。");
				sc.nextLine();
			}
		}
	}



	
	public void printMainMenu() {
		System.out.println();
		System.out.println("  観光地について調べましよう！ ");
		System.out.println("│\t1. 観光地入力\t\t│");
		System.out.println("│\t2. 観光地出力\t\t│");
		System.out.println("│\t4. 観光地修正\t\t│");
		System.out.println("│\t3. 観光地削除\t\t│");
		System.out.println("└\t0. プログラム終了\t\t┘");
		System.out.print("** 番号選択 > ");
	}

	public void add() {
		Castle c=null;
		System.out.println();
		System.out.println("--観光地の種類---");
		System.out.println("1. 宮");
		System.out.println("2. 公園");
		System.out.print("登録するタイプを選んでください>>");
		int inum = sc.nextInt();
		switch (inum) {
		case 1:
			sc.nextLine();
			System.out.print("名前を入力>>>");
			String area_name = sc.nextLine();
			System.out.print("入場料を入力>>>");
			int fee = sc.nextInt();
			System.out.print("営業開始時間を入力>>>");
			int starttime = sc.nextInt();
			System.out.print("営業終了時間を入力>>>");
			int closetime = sc.nextInt();
			System.out.print("地下鉄路線を入力(1-9号線>>>");
			int subwayLine = sc.nextInt();
			System.out.print("建設年度入力>>>");
			int birth = sc.nextInt();
			sc.nextLine();
			System.out.print("王の名前>>>"); 
			String king = sc.nextLine();
			 c = new Castle(area_name, fee, starttime, closetime, subwayLine, birth, king);
		 
	boolean InsertCastle = manager.insertCastle(c);
	if (InsertCastle) {
		System.out.println("SAVE 成功しました。");
	}else {
		System.out.println("SAVE 失敗しました。");
	}
	break;
case 2:
	Park p =new Park();
	sc.nextLine();
	System.out.print("名前を入力>>>");
	area_name = sc.nextLine();
	System.out.print("入場料を入力>>>");
	fee = sc.nextInt();
	System.out.print("営業開始時間を入力>>>");
	starttime = sc.nextInt();
	System.out.print("営業終了時間を入力>>>");
	closetime = sc.nextInt();
	System.out.print("地下鉄路線を入力(1-9号線>>>");
	subwayLine = sc.nextInt();
	sc.nextLine();
	System.out.print("住所を入力してください。>>");
	String location = sc.nextLine();
	System.out.println("公園の情報が保存されました。");
	int manageOffice = sc.nextInt();
	p= new Park(area_name, fee, starttime, closetime, subwayLine, location, manageOffice);
	
	  boolean InsertPark =manager.insertPark(p);
	  if (InsertPark) {
		  System.out.println("[SAVE]成功しました。");
		}else {
			System.out.println("[SAVE]失敗しました。");
	}
			break;
		default:
			System.out.println("[ERROR] をもう一度選択してください。");
			break;
		}

}
	public void read() {
		System.out.print("情報出力番号を選択してください。[(1)castel,(2)park] ");
		int num = sc.nextInt();
		ArrayList<HashMap<String, Object>> list = manager.listAll(num);
		
		for(HashMap<String, Object> map : list) {
			System.out.print("名前 :"+map.get("AREA_NAME")+"\t");
			System.out.print("料金 :"+map.get("FEE")+"won"+"\t");
			System.out.print("開始 :"+map.get("STARTTIME")+"時"+"\t");
			System.out.print("終わり :"+map.get("CLOSETIME")+"時"+"\t");
			System.out.print("地下鉄 :"+map.get("SUBWAYLINE")+"号線"+"\t");
			if (num==1) {
				System.out.print("建設日 :"+map.get("BIRTH")+"年"+"\t");
				System.out.println("王 :"+map.get("KING")+"\t");
			}else if (num==2 ) {
				System.out.print("場所:"+map.get("LOCATION")+"\t");
				System.out.println("管理室 :"+map.get("MANAGEOFFICE")+"個"+"\t");
				
			}
		}
	}
		

	void delete() {
		String area_name = null;
		sc.nextLine();
		System.out.println();
		System.out.println("[ 観光地情報を削除 ]");
		System.out.print("** 削除します場所名> ");
		area_name = sc.nextLine();
		boolean res = manager.deleteTour(area_name);
		if (res) {
			System.out.println("[情報]削除されました。");
		} else {
			System.out.println("[情報]削除対象が存在しません");
		}
	}
	
	public void update() {
		sc.nextLine();
		
		System.out.println("[ 観光地の場所を修正 ]");
		System.out.print("** 修正する場所名 > ");
		String area_name  = sc.nextLine();
		
		System.out.print("修正する入場料入力 >>");
		int fee = sc.nextInt();
		System.out.print("修正する開始時間>> ");
		int starttime = sc.nextInt();
		System.out.print("修正する終了時間>>");
		int closetime = sc.nextInt();
		System.out.print("修正する地下鉄路線>>");
		int subwayLine = sc.nextInt();
		TourArea tourarea = new TourArea(area_name, fee, starttime, closetime, subwayLine);
		boolean res = manager.updateTour(tourarea);
		if (res) {
			System.out.println("[情報]修正されました");
		} else {
			System.out.println("[情報]修正に失敗しました");
		}
	}

}
