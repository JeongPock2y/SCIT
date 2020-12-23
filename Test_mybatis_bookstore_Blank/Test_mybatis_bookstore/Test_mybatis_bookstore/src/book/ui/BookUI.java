package book.ui;

import java.util.ArrayList;
import java.util.Scanner;


import book.mgr.BookManager;
import book.vo.BookVO;

/**
 * 서점 관리 사용자 인터페이스
 */
public class BookUI {

	/**
	 * 도서 정보 처리 기능을 담당하는 클래스의 객체
	 */
	BookManager mgr = new BookManager();
	/**
	 * 키보드 입력 기능의 객체
	 */
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 기본 생성자 - 현재 객체 최초 생성시 BookDAO와 Scanner 클래스의 객체를 생성하여 사용한다.
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
					System.out.println("[알림]프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println(" [알림]다시 선택하세요.");
			 }
			}
		}
	
	
	
	/**
	 * 메뉴 출력 화면 & 메뉴 번호 입력
	 * @return 사용자가 입력한 메뉴 번호
	 */
	public void printMenu() {
		System.out.println("[ 서점 관리 ]");
		System.out.println("1. 도서정보 등록");
		System.out.println("2. 전체 목록 출력");
		System.out.println("3. 도서 정보 삭제");
		System.out.println("4. 도서 정보 수정");
		System.out.println("5. 검색");
		System.out.println("6. 출판사별 검색");
		System.out.println("0. 프로그램 종료");
		System.out.print("* 번호 선택 : ");
	}

	/**
	 * 새 도서정보 등록 화면
	 */
	public void input() {
		String  title;
		String  author;
		String publisher;
		int price;
		boolean res;
		sc.nextLine();
		System.out.println("[ 새 도서정보 등록 ]");
		System.out.print("제목 : ");
		title = sc.nextLine();
		System.out.print("저자 : ");
		author = sc.nextLine();
		System.out.print("출판사 : ");
		publisher = sc.nextLine();
		System.out.print("가격 : ");
		price = sc.nextInt();
		BookVO vo = new BookVO(title, author, publisher, price);
		res = mgr.insertBook(vo);
		
		if (res) {
			System.out.println("[알림]저장되었습니다.");
		}
		else {
			System.out.println("[알림]저장 실패하였습니다.");
			return;
		}
		
	}
	
	/**
	 * 전체 도서목록 출력 화면
	 */
	public void output() {
		System.out.println("[ 글목록 ]");
		ArrayList<BookVO> list = mgr.listAll();
		System.out.println("번호\t제목\t저자\t출판사\t가격\t등록일");
		System.out.println("=============================================");
		if (list == null || list.size() == 0) {
			System.out.println("[알림]등록된 글이 없습니다.");
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
	 * 번호로 정보 삭제 화면
	 */
	public void delete() {
		System.out.println("[ 도서 정보 삭제 ]");
		System.out.print("* 삭제할 번호  : ");
		int bnum = 0;
			bnum = sc.nextInt();
		boolean res = mgr.deleteBook(bnum);
		if (res) {
			System.out.println("[알림] 삭제되었습니다.");
		}
		else {
			System.out.println("[알림] 삭제할 데이터가 없습니다");
		}
		return;
	}
	
	/**
	 * 도서정보 수정 화면
	 */
	public void update() {
		
		BookVO vo = new BookVO();
		System.out.println("[도서정보 수정]");
		System.out.print("수정할 도서번호 : ");
		int bnum = sc.nextInt();
		System.out.println("*기존 정보");
		vo=mgr.getBook(bnum);
		if (vo != null) {
			System.out.println(vo);
		}else {
			System.out.println("[알림]수정할 데이터가 없습니다.");
			return;
		}
		System.out.println("================");	
		sc.nextLine();
		System.out.println("*수정할 정보");
		System.out.print("제목 :");
		String updateTitle = sc.nextLine();
		System.out.print("저자 :");
		String updateAuthor = sc.nextLine();
		System.out.print("출판사 :");
		String updatePublisher = sc.nextLine();
		System.out.print("가격 :");
		int updatePrice = sc.nextInt();
		vo.setTitle(updateTitle);
		vo.setAuthor(updateAuthor);
		vo.setPublisher(updatePublisher);
		vo.setPrice(updatePrice);
		boolean pp = mgr.updateBook(vo);
		if (pp) {
			System.out.println("[알림] 수정되었습니다.");
		} else {
			System.out.println("[알림] 수정에 실패하였습니다.");
		}
		 return;
		}
	
	
	
	/**
	 * 검색 화면
	 */
	public void search() {
		sc.nextLine();
		System.out.println("[검색]");
		System.out.print("검색할 제목 :");
		String text = sc.nextLine();//제목의 텍스트
		System.out.println("번호\t제목\t저자\t출판사\t가격\t등록일");
		System.out.println("===============================");
		ArrayList<BookVO> list =mgr.searchBook(text);
		if (list == null || list.size() == 0) {
			System.out.println("[알림] 검색 결과가 없습니다.");
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
	 * 출판사별 검색 화면
	 */
	public void search2() {
		sc.nextLine();
		System.out.println("[출판사별 최소 가격 검색]");
		System.out.print("출판사 가격");
		System.out.println("===================");
		ArrayList<BookVO> vo = mgr.searchPublisher();
		if (vo == null || vo.size() == 0) {
			System.out.println("[알림] 검색 결과가 없습니다.");
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
