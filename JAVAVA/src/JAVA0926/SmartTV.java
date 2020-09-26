package JAVA0926;

public class SmartTV implements RemoteControl,Searchable{
	private int volume;
	
	public void turnOn() {
		System.out.println("tv를 켜다");

	}
	@Override
	public void turnOff() {
		System.out.println("tv를 끄다");

	}
	@Override
	public void SetVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("tv의 볼륨은 :"+volume);
	}
	public void search(String url) {
		System.out.println(url+"을 검색" );
	}
}
