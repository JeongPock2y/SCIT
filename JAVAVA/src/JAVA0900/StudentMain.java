package JAVA0900;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//����ڷ� ���� �Է¹ޱ� ���� Scanner ��ü
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("[ �л� ���� �Է� ]");
		
		//����ڷ� ���� �л� �̸��� �Է� ����.
		System.out.print("�л� �̸� : ");
		student.setName(sc.nextLine());
		
		//����ڷ� ���� ���� ������ �Է� ����.
		System.out.print("���� ���� : ");
		student.setKor(sc.nextInt());
		
		//����ڷ� ���� ���� ������ �Է� ����.
		System.out.print("���� ���� : ");
		student.setEng(sc.nextInt());
		
		//����ڷ� ���� ���� ������ �Է� ����.
		System.out.print("���� ���� : ");
		student.setMat(sc.nextInt());
		
		
		System.out.println(student.getName()+"���� ������"+student.getTotal()+"�� �̰�"+
							"�����"+student.getAverage()+"�� �Դϴ�.");
		
		//�Է¹��� ������ ������ Student ��ü ����
		//�ڵ带 �ۼ��Ͻÿ�.
		
		//�Է¹��� �л� �̸��� ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
		//�ڵ带 �ۼ��Ͻÿ�.
		//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
		//�ڵ带 �ۼ��Ͻÿ�.
		//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
		//�ڵ带 �ۼ��Ͻÿ�.
		//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
		//�ڵ带 �ۼ��Ͻÿ�.
		
		//Student ��ü�� ����� �̸��� ����, ����� ���
		//�ڵ带 �ۼ��Ͻÿ�.
	}

}