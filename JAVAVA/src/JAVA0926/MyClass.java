package JAVA0926;

public class MyClass {
//field
	RemoteControl rc = new Tv();
//constructor
	public MyClass() {
	}

	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.SetVolume(5);

	}
//method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.SetVolume(5);
	}

	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.SetVolume(5);
	}

}
