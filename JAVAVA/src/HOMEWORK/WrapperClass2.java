package HOMEWORK;
public class WrapperClass2 {

	public static void main(String[] args) {
		Integer lapseTime = 2*60*60+1*60+39;
		//�⺻�ڷ����� �ڵ����� ����ڽ����� 
		Double distance = 42.195;
		Double totalSecond = lapseTime / distance;
		Double minute = Math.floor(totalSecond / 60);
		Double second = Math.floor(totalSecond %60);
		
		System.out.println("������"+minute+"��" +second+"��" );

	}

}
