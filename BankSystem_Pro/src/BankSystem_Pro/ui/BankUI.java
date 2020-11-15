package BankSystem_Pro.ui;
import java.util.Scanner;


import BankSystem_Pro.vo.SinhanBank;
import BankSystem_Pro.vo.User;


public class BankUI {
	Scanner sc = new Scanner(System.in);
	SinhanBank bank = new SinhanBank();
	
	public BankUI(SinhanBank bank) {
		this.bank = bank;
	}

	public BankUI() {
		int menuNum = 0;
		
			while (true) {
				printMainMenu();
				menuNum=sc.nextInt();
				sc.nextLine();
				switch (menuNum) {
				case 1:insertCount();
					break;
				case 2:getCount();
					break;
				case 3:depositCount();
					break;
				case 4:withdrawCount();
					break;
				case 5:sendMoneyCount();
					break;
				case 6:
					System.out.println("시스템 끌게요.");
					return;
				default:
					break;
				}
			}
		} 
	public void printMainMenu() {
		System.out.println("====은행계좌관리====");
		System.out.println("1.계좌등록");
		System.out.println("2.전체출력");
		System.out.println("3.입금");
		System.out.println("4.출금");
		System.out.println("5.송금");
		System.out.println("6.프로그램종료");
		System.out.println("=================");
		System.out.print("선택 : ");
	}
	public void insertCount() {
		System.out.print("계좌주 이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("계좌 번호 입력 : ");
		String accountNumber = sc.nextLine();
		System.out.print("잔고 입력 : ");
		int charge = sc.nextInt();
		User user = new User(name, accountNumber, charge);
		bank.register(user);
	}//찾기출력
	public void getCount() {
		bank.printAllUsers();
	}
	//입금
	public void depositCount() {
		System.out.print("입금할 계좌번호 입력 : ");
		String countNum = sc.nextLine();
		System.out.print("입금금액 입력 : ");
		int inputMoney = sc.nextInt();
		bank.input(countNum,inputMoney);
		System.out.println();
	}
	//출금
	public void withdrawCount() {
		System.out.print("출금할 계좌번호 입력 : ");
		String countNum = sc.nextLine();
		System.out.print("출금금액 입력 : ");
		int outMoney = sc.nextInt();
		bank.output(countNum, outMoney);
		
		
		
	}
	//송금
	public void sendMoneyCount() {
		System.out.print("송금할 계좌번호 입력 : ");
		String countNum1 = sc.nextLine();
		System.out.print("송금 받을 계좌 입력 : ");
		String countNum2 = sc.nextLine();
		System.out.println("송금 돈:");
		int sendMoney = sc.nextInt();
		bank.send(countNum1, countNum2, sendMoney);
		
	}

}
