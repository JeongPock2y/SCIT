package user.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import user.vo.User;

public class UserDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//ȸ������ ����
	public int insertUser(User user) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			cnt = mapper.insertUser(user);
			
			if (user.getPhone() != null && !user.getPhone().isEmpty() && user.getAddress() != null && !user.getAddress().isEmpty()) {
				mapper.insertAddress(user);
			}
			session.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return cnt;
	}

	//��ü ȸ�� ���
	public ArrayList<User> listUser() {
		SqlSession session = null;
		ArrayList<User> list = null;
		
		try {
			session = factory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.listUser();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null) session.close();
		}
		
		return list;
	}

}
