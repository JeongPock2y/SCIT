package JAVA0922;

public class CountTest {

	public static void main(String[] args) {
		Count c1 =  new Count();
		Count c2 =  new Count();
		Count c3 =  new Count();
		
		System.out.println("c1.serialNumber :"+c1.serialNumber);
		System.out.println("c2.serialNumber :"+c2.serialNumber);
		System.out.println("c3.serialNumber :"+c3.serialNumber);
		//static ����� Ŭ���� ������ Ŭ������ �̸����� ���� �����ϴ�.
		System.out.println("Count.counter : "+ Count.counter);
		//�������ó�� ��ü�� �̸����ε� ������ �����ϴ�.
		System.out.println("c2.counter :"+ c2.counter);
		
		//�Ʒ��ΰ����� ���  ��ü�� �ȸ���� Ŭ�����̸����� �ᵵ�ǰ�
		// Ŭ���� ������ �Ʒ�ó���ᵵ �����ϴ�
	}

}
