package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import board.mgr.BoardManager;
import board.vo.Board;

/**
 * 게시판 프로그램의 사용자 화면
 */
public class BoardUI {
	private BoardManager mgr = new BoardManager();
	private Scanner sc = new Scanner(System.in); // 키보드로부터 입력받기 위한 클래스의 객체

	/**
	 * 생성자. 메뉴화면을 띄우고 사용자의 입력을 받는다.
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
				default:System.out.println("다른 형식");break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			
		}
		
		
		
	}

	/**
	 * 메인 메뉴를 출력한다.
	 */
	public void printMainMenu() {
		System.out.println("[게시판 연습]");
		System.out.println("1. 글 쓰기");
		System.out.println("2. 글 전체 목록");
		System.out.println("3. 글 읽기");
		System.out.println("4. 글 삭제");
		System.out.println("5. 글 검색");
		System.out.println("9. 프로그램 종료");
		System.out.print("입력 할 메뉴 번호를 입력해주세요 >>");
	}
	/**
	 * 글쓰기
	 */
	void insert() {
		System.out.println("[글쓰기]");
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("제목 :");
		String title = sc.nextLine();
		System.out.print("내용 :");
		String content = sc.nextLine();
		Board board = new Board(name, title,content);
		boolean k = mgr.insertBoard(board);
		if (k) {
			System.out.println("저장되었습니다.");
		}else {
			System.out.println("실패 했습니다.");
		}
	}

	/**
	 * 전체 글 목록
	 */
	void list() {
		System.out.println("[글목록]");
		ArrayList<Board> list = null;
		list =mgr.listBoard();
		
		if (list == null || list.size() == 0) {
			System.out.println("글이 없습니다.");
			return;
		}
		else {
			for (Board b : list) {
				System.out.print("번호:" + b.getBoardnum() + "\t");
				System.out.print("작성자:" + b.getName() + "\t");
				System.out.println("제목:" + b.getTitle());
			}
		}
	}

	/**
	 * 글 1개 읽기
	 */
	void read() {
		System.out.println("[글읽기]");
		System.out.print("** 읽을 글 번호  : ");
		int boardnum = input();
		Board board = new Board();
		board=mgr.readBoard(boardnum);
		if (board == null) {
			System.out.println("결과없음");
			return;
		}
		System.out.println("번호 : " + board.getBoardnum());
		System.out.println("작성자 : " + board.getName());
		System.out.println("조회수 : " + board.getHits());
		System.out.println("작성날짜 : " + board.getIndate());
		System.out.println("제목 : " + board.getTitle());
		System.out.println("내용 : " + board.getContent());
		
	}
	

	/**
	 * 글 1개 삭제
	 */
	void delete() {
		System.out.println("[글삭제]");
		System.out.print("*삭제 할 글 번호 : ");
		int boardnum = input();
		boolean n =mgr.deletBoard(boardnum);
		if (n) {
			System.out.println("삭제");
		}else {
			System.out.println("ss");
		}
	}

	/**
	 * 검색
	 */
	void search() {
		System.out.println("[글검색]");
		System.out.print("**제목을 입력하세요");
		String boardnum = sc.nextLine();
		ArrayList<Board> list =mgr.searchBoard(boardnum);
		if (list == null || list.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.print("번호 : " + board.getBoardnum());
			System.out.print("작성자 : " + board.getName());
			System.out.println("제목 : " + board.getTitle());
		}
	}

	// nextline 씹히는 오류 방지 메소드
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
