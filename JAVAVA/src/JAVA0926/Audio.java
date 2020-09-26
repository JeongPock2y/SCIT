package JAVA0926;
//구현클래스
public class Audio implements RemoteControl{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("turn on the audio ");
		
	}

	@Override
	public void turnOff() {
		System.out.println("turn off the audio ");
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
		System.out.println("Audio의 볼륨은 :"+volume);
	}	
			
}

	
