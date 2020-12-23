package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import board.mgr.BoardManager;
import board.vo.Board;

/**
 * �Խ��� ���α׷��� ����� ȭ��
 */
public class BoardUI {
	private BoardManager mgr = new BoardManager();
	private Scanner sc = new Scanner(System.in); // Ű����κ��� �Է¹ޱ� ���� Ŭ������ ��ü

	/**
	 * ������. �޴�ȭ���� ���� ������� �Է��� �޴´�.
	 */
	public BoardUI() {
		int n =0;
		while(true) {
			printMainMenu();
			try {
				n=input();
				switch (n) {
				case 1: insert();break;
				case 2: list();break;
				case 3: read();break;
				case 4: delete();break;
				case 5: search();break;
				case 9: return;
				default:System.out.println("�ٸ� ����");break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			
		}
		
		
		
	}

	/**
	 * ���� �޴��� ����Ѵ�.
	 */
	public void printMainMenu() {
		System.out.println("[�Խ��� ����]");
		System.out.println("1. �� ����");
		System.out.println("2. �� ��ü ���");
		System.out.println("3. �� �б�");
		System.out.println("4. �� ����");
		System.out.println("5. �� �˻�");
		System.out.println("9. ���α׷� ����");
		System.out.print("�Է� �� �޴� ��ȣ�� �Է����ּ��� >>");
	}
	/**
	 * �۾���
	 */
	void insert() {
		System.out.println("[�۾���]");
		System.out.print("�̸� :");
		String name = sc.nextLine();
		System.out.print("���� :");
		String title = sc.nextLine();
		System.out.print("���� :");
		String content = sc.nextLine();
		Board board = new Board(name, title,content);
		boolean k = mgr.insertBoard(board);
		if (k) {
			System.out.println("����Ǿ����ϴ�.");
		}else {
			System.out.println("���� �߽��ϴ�.");
		}
	}

	/**
	 * ��ü �� ���
	 */
	void list() {
		System.out.println("[�۸��]");
		ArrayList<Board> list = null;
		list =mgr.listBoard();
		
		if (list == null || list.size() == 0) {
			System.out.println("���� �����ϴ�.");
			return;
		}
		else {
			for (Board b : list) {
				System.out.print("��ȣ:" + b.getBoardnum() + "\t");
				System.out.print("�ۼ���:" + b.getName() + "\t");
				System.out.println("����:" + b.getTitle());
			}
		}
	}

	/**
	 * �� 1�� �б�
	 */
	void read() {
		System.out.println("[���б�]");
		System.out.print("** ���� �� ��ȣ  : ");
		int boardnum = input();
		Board board = new Board();
		board=mgr.readBoard(boardnum);
		if (board == null) {
			System.out.println("�������");
			return;
		}
		System.out.println("��ȣ : " + board.getBoardnum());
		System.out.println("�ۼ��� : " + board.getName());
		System.out.println("��ȸ�� : " + board.getHits());
		System.out.println("�ۼ���¥ : " + board.getIndate());
		System.out.println("���� : " + board.getTitle());
		System.out.println("���� : " + board.getContent());
		
	}
	

	/**
	 * �� 1�� ����
	 */
	void delete() {
		System.out.println("[�ۻ���]");
		System.out.print("*���� �� �� ��ȣ : ");
		int boardnum = input();
		boolean n =mgr.deletBoard(boardnum);
		if (n) {
			System.out.println("����");
		}else {
			System.out.println("ss");
		}
	}

	/**
	 * �˻�
	 */
	void search() {
		System.out.println("[�۰˻�]");
		System.out.print("**������ �Է��ϼ���");
		String boardnum = sc.nextLine();
		ArrayList<Board> list =mgr.searchBoard(boardnum);
		if (list == null || list.size() == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.print("��ȣ : " + board.getBoardnum());
			System.out.print("�ۼ��� : " + board.getName());
			System.out.println("���� : " + board.getTitle());
		}
	}

	// nextline ������ ���� ���� �޼ҵ�
	public int input() {
		int count = 0;

		try {
			count = sc.nextInt();
		} catch (Exception e) {
			throw e;
		} finally {
			sc.nextLine();
		}

		return count;
	}

}
