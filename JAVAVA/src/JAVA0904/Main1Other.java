package JAVA0904;

public class Main1Other {

	public static void main(String[] args) {
		
        int bookstore = 1000; // 책장
        int people = 2; // 인원 수
        
        int books = bookstore * 300;
        int day = 1;
        
        while(true) {
            if(day % 10 == 0) people *= 2;    // 10일 마다 인원 수 2배
            books = books - people * 30;
            if(books <= 0) break;
            
            System.out.printf("%d일 %d명 남은책: %d권\n", day, people, books);
            
            day++;
        }


	}

}