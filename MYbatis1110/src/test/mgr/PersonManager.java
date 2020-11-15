package test.mgr;

import java.util.ArrayList;

import test.dao.PersonDAO;
import test.vo.PersonVO;

public class PersonManager {
	//연욱짱!!
	//치카라 나리!!!
	//어머나 어머나 이러지 마세요.
	//dao 클래스의 객체를 생성한다.
	private PersonDAO dao = new PersonDAO();
	
	public boolean insertPerson(PersonVO person) { 
		//회원 등록기능
		//count 변수에는 insertSQL 구문이 실행된 횟수
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
