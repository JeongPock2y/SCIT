package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.PersonVO;

public class PersonDAO {
	//제일먼저 이걸 작성해주어야한다
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	//메소드를 만들자 메퍼 인터페이스에서 그대로복사해서 ;만빼고  역순으로만드는거니까  그다음단계인 이너페이스 에서 
	//변경된것이 없었으니까 그대로 가져올수있다는 말임
	//추상 메소드
	//16-22번째 까지의 코드가 실행되는 동안에는 예외가 발생할 수 있다.
	public int insertPerson(PersonVO person) {
		//위의 int에서 마이바티스의 기능이로  몇번 실행되었는지를 카운팅해줌 (마바 내부기능이니 알고만있기)
		int count =0;
		//Java 하고 DB 를 연결하다 ->SqlSession객체를 생성햇 open해야한다.
		SqlSession ss =null;
		try {
			 ss = factory.openSession();
			//MapperInterface 객체를 생성한다.
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			count =mapper.insertPerson(person);
			//insert,update,delete SQL을 실행한 후 에는 반드시 commit!!!
			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();//어디서 어떤 예외가 발생했는지 출력해주는 코드
		}finally {
		//사용이 끝낫다면 예외가 발생 유무에 상관없이 연결된 Session은 종료하여야한다.
		if(ss != null) {
			ss.close();
		}
	}
		return count;
}
	public ArrayList<PersonVO> selectPerson(){
		ArrayList<PersonVO> pList =null;
		SqlSession ss =null;
		try {
			 ss = factory.openSession();
			//MapperInterface 객체를 생성한다.
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			pList=mapper.selectPerson();
			//insert,update,delete SQL을 실행한 후 에는 반드시 commit!!!
			//ss.commit(); 셀렉은 이거 ㄴ필요
		} catch (Exception e) {
			e.printStackTrace();//어디서 어떤 예외가 발생했는지 출력해주는 코드
		}finally {
		//사용이 끝낫다면 예외가 발생 유무에 상관없이 연결된 Session은 종료하여야한다.
		if(ss != null) {
			ss.close();
		}
	
	}
		return pList;
	}
	public PersonVO selectPersonOne(int num) {
		SqlSession ss =null;
		PersonVO vo =null;
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			vo = mapper.selectPersonOne(num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return vo;
	}
	public int deletePerson(int num) {
		SqlSession ss = null;
		int count =0;
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			count = mapper.deletePerson(num);
			ss.commit();//삭제는 커밋!!!!
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ss != null) {
				ss.close();
			}
		}
		return count;
	}
	public int updatePerson(PersonVO person) {
		SqlSession ss = null;
		int count =0;
		try {
			ss = factory.openSession();
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			count = mapper.updatePerson(person);
			ss.commit();//삭제는 커밋!!!!
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ss != null) {
				ss.close();
			}
		}
		return count;
	}

	
}
