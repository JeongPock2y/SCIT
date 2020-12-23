package book.ui;

import java.util.ArrayList;
import java.util.Scanner;


import book.mgr.BookManager;
import book.vo.BookVO;

/**
 * ���� ���� ����� �������̽�
 */
public class BookUI {

	/**
	 * ���� ���� ó�� ����� ����ϴ� Ŭ������ ��ü
	 */
	BookManager mgr = new BookManager();
	/**
	 * Ű���� �Է� ����� ��ü
	 */
	Scanner sc = new Scanner(System.in);
	
	/**
	 * �⺻ ������ - ���� ��ü ���� ������ BookDAO�� Scanner Ŭ������ ��ü�� �����Ͽ� ����Ѵ�.
	 */
	public BookUI() {
		while(true) {
			this.printMenu();
			int no=sc.nextInt();
			switch(no){
				case 1:input();break;
				case 2:output();break;
				case 3:delete();break;
				case 4:update();break;
				case 5:search();break;
				case 6:search2();break;
				case 0: 
					System.out.println("[�˸�]���α׷��� �����մϴ�.");
					System.exit(0);
				default:
					System.out.println(" [�˸�]�ٽ� �����ϼ���.");
			 }
			}
		}
	
	
	
	/**
	 * �޴� ��� ȭ�� & �޴� ��ȣ �Է�
	 * @return ����ڰ� �Է��� �޴� ��ȣ
	 */
	public void printMenu() {
		System.out.println("[ ���� ���� ]");
		System.out.println("1. �������� ���");
		System.out.println("2. ��ü ��� ���");
		System.out.println("3. ���� ���� ����");
		System.out.println("4. ���� ���� ����");
		System.out.println("5. �˻�");
		System.out.println("6. ���ǻ纰 �˻�");
		System.out.println("0. ���α׷� ����");
		System.out.print("* ��ȣ ���� : ");
	}

	/**
	 * �� �������� ��� ȭ��
	 */
	public void input() {
		String  title;
		String  author;
		String publisher;
		int price;
		boolean res;
		sc.nextLine();
		System.out.println("[ �� �������� ��� ]");
		System.out.print("���� : ");
		title = sc.nextLine();
		System.out.print("���� : ");
		author = sc.nextLine();
		System.out.print("���ǻ� : ");
		publisher = sc.nextLine();
		System.out.print("���� : ");
		price = sc.nextInt();
		BookVO vo = new BookVO(title, author, publisher, price);
		res = mgr.insertBook(vo);
		
		if (res) {
			System.out.println("[�˸�]����Ǿ����ϴ�.");
		}
		else {
			System.out.println("[�˸�]���� �����Ͽ����ϴ�.");
			return;
		}
		
	}
	
	/**
	 * ��ü ������� ��� ȭ��
	 */
	public void output() {
		System.out.println("[ �۸�� ]");
		ArrayList<BookVO> list = mgr.listAll();
		System.out.println("��ȣ\t����\t����\t���ǻ�\t����\t�����");
		System.out.println("=============================================");
		if (list == null || list.size() == 0) {
			System.out.println("[�˸�]��ϵ� ���� �����ϴ�.");
			return;
		}
		else {
			for (BookVO b : list) {
				
				System.out.print(b.getBnum() + "\t");
				System.out.print(b.getTitle() + "\t");
				System.out.print(b.getAuthor()+ "\t");
				System.out.print(b.getPublisher()+ "\t");
				System.out.print(b.getPrice()+ "\t");
				System.out.println(b.getInputdate()+ "\t");
			}
				
			}
		return;
		}
	
		
	
	
	/**
	 * ��ȣ�� ���� ���� ȭ��
	 */
	public void delete() {
		System.out.println("[ ���� ���� ���� ]");
		System.out.print("* ������ ��ȣ  : ");
		int bnum = 0;
			bnum = sc.nextInt();
		boolean res = mgr.deleteBook(bnum);
		if (res) {
			System.out.println("[�˸�] �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("[�˸�] ������ �����Ͱ� �����ϴ�");
		}
		return;
	}
	
	/**
	 * �������� ���� ȭ��
	 */
	public void update() {
		
		BookVO vo = new BookVO();
		System.out.println("[�������� ����]");
		System.out.print("������ ������ȣ : ");
		int bnum = sc.nextInt();
		System.out.println("*���� ����");
		vo=mgr.getBook(bnum);
		if (vo != null) {
			System.out.println(vo);
		}else {
			System.out.println("[�˸�]������ �����Ͱ� �����ϴ�.");
			return;
		}
		System.out.println("================");	
		sc.nextLine();
		System.out.println("*������ ����");
		System.out.print("���� :");
		String updateTitle = sc.nextLine();
		System.out.print("���� :");
		String updateAuthor = sc.nextLine();
		System.out.print("���ǻ� :");
		String updatePublisher = sc.nextLine();
		System.out.print("���� :");
		int updatePrice = sc.nextInt();
		vo.setTitle(updateTitle);
		vo.setAuthor(updateAuthor);
		vo.setPublisher(updatePublisher);
		vo.setPrice(updatePrice);
		boolean pp = mgr.updateBook(vo);
		if (pp) {
			System.out.println("[�˸�] �����Ǿ����ϴ�.");
		} else {
			System.out.println("[�˸�] ������ �����Ͽ����ϴ�.");
		}
		 return;
		}
	
	
	
	/**
	 * �˻� ȭ��
	 */
	public void search() {
		sc.nextLine();
		System.out.println("[�˻�]");
		System.out.print("�˻��� ���� :");
		String text = sc.nextLine();//������ �ؽ�Ʈ
		System.out.println("��ȣ\t����\t����\t���ǻ�\t����\t�����");
		System.out.println("===============================");
		ArrayList<BookVO> list =mgr.searchBook(text);
		if (list == null || list.size() == 0) {
			System.out.println("[�˸�] �˻� ����� �����ϴ�.");
			return;
		}
		else {
			for (BookVO b : list) {
				
				System.out.print(b.getBnum() + "\t");
				System.out.print(b.getTitle() + "\t");
				System.out.print(b.getAuthor()+ "\t");
				System.out.print(b.getPublisher()+ "\t");
				System.out.print(b.getPrice()+ "\t");
				System.out.println(b.getInputdate()+ "\t");
			}
				
			}
		return;
	}
	
	
	/**
	 * ���ǻ纰 �˻� ȭ��
	 */
	public void search2() {
		sc.nextLine();
		System.out.println("[���ǻ纰 �ּ� ���� �˻�]");
		System.out.print("���ǻ� ����");
		System.out.println("===================");
		ArrayList<BookVO> vo = mgr.searchPublisher();
		if (vo == null || vo.size() == 0) {
			System.out.println("[�˸�] �˻� ����� �����ϴ�.");
			return;
		}
		else {
			for (BookVO b : vo) {
				System.out.print(b.getPublisher() + "\t");
				System.out.println(b.getPrice() + "\t");
			}
		
		}
		return;
	}
		
		
	
	
	
	
	

}
