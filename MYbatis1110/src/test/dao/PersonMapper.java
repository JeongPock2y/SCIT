package test.dao;

import java.util.ArrayList;

import test.vo.PersonVO;

public interface PersonMapper {
	//������ sql ������ in up de �� ��쿡�� �� sql������ ����� Ƚ���� return���ش�.
	//void �ε� int ��� ���� -->�������� �ùٸ��� ����� Ƚ���� ��������
	public int insertPerson(PersonVO person);
	//vo��!!! �� �����ֱ����ؼ� ��! �Ѱ��̻�!!!!!!
	public ArrayList<PersonVO> selectPerson();
	//��� �Ķ���� Ÿ���� �����ϱ� �̷��� �������
	public PersonVO selectPersonOne(int num);
	//num ��  �⺻Ű�̴ϱ� �ϳ��� ���ð��̰�   name�����Ŷ��  ��̸���Ʈ�������
	// �ȿ� where���� �⺻Ű�� �߰��ȴٸ� ���� �Ѱ� Ȥ�� ���� . 
	//delete
	public int deletePerson(int num);
	//update
	public int updatePerson(PersonVO person);

	
	
}
