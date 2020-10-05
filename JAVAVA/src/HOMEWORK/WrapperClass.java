package HOMEWORK;
public class WrapperClass {

	public static void main(String[] args) {
		byte b = 3;
		int i= 257;
		Byte b2 = new Byte(b);//���� Ŭ����
		Integer i2 = new Integer(i);
		
		System.out.println(b2);
		System.out.println(i2);
		//���� ��ü�� ȣ���ϸ� �ּڰ��̳��;��ϴµ�  �������̵�
		// ������ toString �� ������ �ִ�  ==�����Ѱ��� �������
		byte b3 = b2.byteValue();//�⺻�ڷ��� byte�� ���� ��ȯ
		int i3 = i2.intValue(); 
		
	
		System.out.println("b3 ="+b3);//byte��
		System.out.println("i3 ="+b3);//int��
		
		String strNum = "10";
		int i4 = Integer.parseInt(strNum);//static���̶� ��������
		//10�̶�� ��Ʈ������ ��Ʈ��������
		System.out.println("i3 + i4 ="+(i3+i4));
		
	}
}
