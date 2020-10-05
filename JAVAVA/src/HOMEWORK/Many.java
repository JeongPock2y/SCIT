package HOMEWORK;
public class Many {

	public static void main(String[] args) {
		// ���ڿ� ����
		String s1 = "Test abcd";
		String Replace = s1.replace('a', 'c');
		System.out.println(Replace);

		// split
		// "-"���ڸ��������� �ڸ��ڴ�
		// �����ڴ� ���Ե��� �ʴ´�
		// ���ڿ��� ������� ��µȴ�.
		String s2 = "010-8273-6631";
		String[] Split = s2.split("-");
		for (int i = 0; i < Split.length; i++) {
			System.out.println(Split[i]);
		}
		// ���� �� ���鵵 �����ϴ�
		String s3 = "010 8273 6631";
		String[] Split1 = s3.split(" ");
		for (int i = 0; i < Split1.length; i++) {
			System.out.println(Split1[i]);
		}
		// �빮�ڸ� �ҹ��ڷ�
		// �ҹ��ڸ� �빮�ڷ� ����
		// �˻������� ����� �Է½� �ҹ��� �빮�ڸ� ���Ͻ�
		// ��ҹ��ڸ� ����ᵵ �ùٸ� ���� �Էµǵ���
		String s4 = "Test";
		String s5 = "java";
		String lowerStr = s4.toLowerCase();
		String upperStr = s5.toUpperCase();

		System.out.println(lowerStr);
		System.out.println(upperStr);

		String s6 = "              as   sdf       ";
		String trimStr = s6.trim();// �հ� ���� ���鸸 ���̴� ����
		System.out.println(trimStr);
		//�������������ʴ´�
		System.out.println(s6);
	}
}
