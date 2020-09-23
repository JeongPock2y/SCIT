package JAVA0915;


public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();//객체가만들어지는순간  북 클래스 필드가 생성됨
		//book객체를 이용  기능들을 사용
		//Book 클래스를 통해서 만든  book객체의 타이틀
		book.setTitle("마법천자문28권");//메소드를 호출 실행하다.
		//book.getTitle();//string 이됨 리턴받았으니 그래서 이걸  스트링변수로만들어줌
		//String title = book.getTitle();
		//System.out.println(title);
		book.setPrice(50000);
		//int price = book.getPrice();
		//System.out.println(price+"원");
		book.setPage(150);
		//int page = book.getPage();
		//System.out.println(page+"장");
		book.printBookInfo();
		System.out.println("---------------------------------------------");
		Book book2 = new Book();
		book2.setTitle("포켓몬스터1권");
		book2.setPage(200);
		book2.setPrice(5000);
		book2.printBookInfo();
		
	}

}
