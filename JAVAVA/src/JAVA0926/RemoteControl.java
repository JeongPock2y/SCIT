package JAVA0926;
//인터페이스는  개발 사용 설명서 이니까  어떠한 생성자도 가질수없음
public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;//(static final) 이생략되어있음 그래서 상수명 은 대문자
	public int MIN_VOLUME = 0;

	// 추상 메소드
	//구현하고 싶은 기능 의 메소드
	public abstract void turnOn(); // 인터페이스의 메소드들은 모두 추상메소드라서   abstract 안써도 알아서 생각함
	public void turnOff();
	public void SetVolume(int volume);
}
