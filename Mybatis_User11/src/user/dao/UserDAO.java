package user.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import oracle.jdbc.OracleConnection.CommitOption;
import user.vo.User;

public class UserDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü

	// ȸ������ ����
	public int insertUser(User user) {
		int count = 0;
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			UserMapper mapper = ss.getMapper(UserMapper.class);

			count = mapper.insertUser(user);

			if (!(user.getPhone() == null||"".equals(user.getPhone()))) {
				count = mapper.insertUser1(user);
			}

			ss.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ss != null) {
				ss.close();
			}
		}
		return count;
	}

	// ��ü ȸ�� ���
	public ArrayList<User> listUser() {
		ArrayList<User> list = null;
		SqlSession ss = null;
		try {
			ss = factory.openSession();
			UserMapper mapper = ss.getMapper(UserMapper.class);
			list = mapper.listUser();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ss != null) {
				ss.close();
			}
		}
		return list;
	}

}
