package JAVA0926;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
		
		RemoteControl rc = tv;
		rc.turnOff();
		rc.turnOn();
		rc.SetVolume(5);
		Searchable searchable = tv;
		searchable.search("http://www.naver.com");
	}

}
