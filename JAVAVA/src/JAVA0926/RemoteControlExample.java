package JAVA0926;

public class RemoteControlExample {
//인터페이스와 구현 클래스를 이용해서  구현 객체 메소드를호출
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Tv();
//		rc.turnOff();
//		rc.turnOn();
//		rc.SetVolume(5);
		rc = new Audio();
//		rc.turnOff();
//		rc.turnOn();
//		rc.SetVolume(5);
		//인터페이스 변수 rc를 통해서  구현 객체의 메소드를 호출
		//위 rc.```코드는 동일한데  어떤 구현객체 메소드를 넣어주는야에 따라서 
		//결과가 다르게나옴
//		tv를 끄다
//		tv를 켜다
//		tv의 볼륨은 :5
//		turn off the audio 
//		turn on the audio 
//		Audio의 볼륨은 :5
		//즉!  이것이  다형성


	}

}
