package test.mgr;

import java.util.ArrayList;

import test.dao.PersonDAO;
import test.vo.PersonVO;

public class PersonManager {
	//����¯!!
	//ġī�� ����!!!
	//��ӳ� ��ӳ� �̷��� ������.
	//dao Ŭ������ ��ü�� �����Ѵ�.
	private PersonDAO dao = new PersonDAO();
	
	public boolean insertPerson(PersonVO person) { 
		//ȸ�� ��ϱ��
		//count �������� insertSQL ������ ����� Ƚ��
		int count = dao.insertPerson(person);
		
		boolean check = false;
		if (count > 0) {
			check = true;
		}
		return check;
	}
	//
	public ArrayList<PersonVO> selectPerson(){
		 return dao.selectPerson();
		
	}
	public PersonVO selectPersonOne(int num) {
		PersonVO vo= dao.selectPersonOne(num);
		return vo;
	}
	public boolean deletePerson(int num) {
		int count = dao.deletePerson(num);
		boolean check = false;
		if (count > 0) {
			check =true;
		}
		return check;
	}
	public boolean updatePerson(PersonVO person) {
		int count = dao.updatePerson(person);
		
		boolean check = false;
		if (count > 0) {
			check = true;
		}
		return check;
	}

	
}
