package JAVA0922;
//static ������  Ŭ���� �ε��� ���� ������ ���� ��ü�� ���������ʾƵ� �Ҹ�Ǿ��밡�� 
public class MyClass {//�ʹ� ������ ��ü�� ��������߸� ��밡��
	String name;
	int age;
	Boolean isMale;
	public MyClass() {
		
	}
	//ó����  �⺻�� 0 null�̾ƴ϶�  ó���� newAge���� ���ؼ� �������ְ� �Ҽ�����
	// ���η�?  ��������鼭 �̹� ������ �ְ� �����;
	//�̷��� �����ڸ� ������ ������ �ڵ����� �⺻�����ڰ� �����ȴ�.
	public MyClass(String name) {
		this.name = name;
		System.out.println(name);
	}
	public MyClass(int age,String name) {
		this.age = age;
		this.name = name;	
		System.out.println(age+"\t"+name);
	}
	public MyClass(int age,String name,Boolean isMale) {
		
		this.age = age;
		this.name = name;
		this.isMale = isMale;
		System.out.println(age+"\t"+name+"\t"+isMale);
	}//������ �����ε�
}
