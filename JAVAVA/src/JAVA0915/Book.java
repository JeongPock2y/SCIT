package JAVA0915;

public class Book {
	String title;// クラスの中で全部使える
	int page;// 얘들이 맴버변수이자 전역변수이자 인스턴스변수 필드
	int price;

	// 메소드 == 기능
	// 접근지정자 -> 리턴타입
	// 메소드를 실행 시킨 다음에 메소드를 실행한 곳으로 전달해야하는 값의 자료형
	// string type으로 전달하겠다라는 의미!!
	// 리턴을 안하면 void ex)main메소드
	// 리턴은 메소드당 1개~!
	// 메소드 이름 getTitle(첫글자는 영문소문자)
	// set 저장 대입 get 출력 꺼내다 는 느낌
	// ()method라는 표시!!!
	// break 는 반복문종료 return 문은 그 메소드를 종료
	public String getTitle() {// 출력
		
		return title;// 오른쪽값을 반환하고 메소드 기능종료
		
	}

	public void setTitle(String bookTitle) {// 입력(String bookTitle) 이거는 지역변수   메인메소드에서  입력될때  실행  출력시 까지 쓰수있음
		title = bookTitle;
		return; // 이렇게 쓰면 오른쪽값이 없으므로 종료의기능만수행한다.쓸수도있다는뜻
		// 안 에 if문을써서 어쩌댄 종료 return이렇게 응용가능하다.
	}

	public int getPage() {
		return page;
	}

	public void setPage(int bookPage) {
		page = bookPage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int bookPrice) {
		price = bookPrice;
	}
	public void printBookInfo() {
		System.out.println("Title :" + title + 
					   	   "page :" + page + 
						   "Price :" + price);
	}

}
