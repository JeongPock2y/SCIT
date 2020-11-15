package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.PersonVO;

public class PersonDAO {
	//���ϸ��� �̰� �ۼ����־���Ѵ�
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	//�޼ҵ带 ������ ���� �������̽����� �״�κ����ؼ� ;������  �������θ���°Ŵϱ�  �״����ܰ��� �̳����̽� ���� 
	//����Ȱ��� �������ϱ� �״�� �����ü��ִٴ� ����
	//�߻� �޼ҵ�
	//16-22��° ������ �ڵ尡 ����Ǵ� ���ȿ��� ���ܰ� �߻��� �� �ִ�.
	public int insertPerson(PersonVO person) {
		//���� int���� ���̹�Ƽ���� ����̷�  ��� ����Ǿ������� ī�������� (���� ���α���̴� �˰��ֱ�)
		int count =0;
		//Java �ϰ� DB �� �����ϴ� ->SqlSession��ü�� ������ open�ؾ��Ѵ�.
		SqlSession ss =null;
		try {
			 ss = factory.openSession();
			//MapperInterface ��ü�� �����Ѵ�.
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			count =mapper.insertPerson(person);
			//insert,update,delete SQL�� ������ �� ���� �ݵ�� commit!!!
			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();//��� � ���ܰ� �߻��ߴ��� ������ִ� �ڵ�
		}finally {
		//����� �����ٸ� ���ܰ� �߻� ������ ������� ����� Session�� �����Ͽ����Ѵ�.
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
			//MapperInterface ��ü�� �����Ѵ�.
			PersonMapper mapper = ss.getMapper(PersonMapper.class);
			pList=mapper.selectPerson();
			//insert,update,delete SQL�� ������ �� ���� �ݵ�� commit!!!
			//ss.commit(); ������ �̰� ���ʿ�
		} catch (Exception e) {
			e.printStackTrace();//��� � ���ܰ� �߻��ߴ��� ������ִ� �ڵ�
		}finally {
		//����� �����ٸ� ���ܰ� �߻� ������ ������� ����� Session�� �����Ͽ����Ѵ�.
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
			ss.commit();//������ Ŀ��!!!!
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
			ss.commit();//������ Ŀ��!!!!
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
