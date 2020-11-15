package test.dao;

import java.util.ArrayList;

import test.vo.PersonVO;

public interface PersonMapper {
	//실행한 sql 구문이 in up de 일 경우에는 그 sql구문이 실행된 횟수를 return해준다.
	//void 인데 int 라고 변경 -->쿼리문이 올바르게 실행된 횟수를 리턴해줌
	public int insertPerson(PersonVO person);
	//vo들!!! 을 보여주기위해서 즉! 한개이상!!!!!!
	public ArrayList<PersonVO> selectPerson();
	//얘는 파라미터 타입이 없으니까 이렇게 만들어짐
	public PersonVO selectPersonOne(int num);
	//num 은  기본키이니까 하나만 나올것이고   name같은거라면  어레이리스트를써야함
	// 안에 where절에 기본키가 추가된다면 값은 한개 혹은 없다 . 
	//delete
	public int deletePerson(int num);
	//update
	public int updatePerson(PersonVO person);

	
	
}
