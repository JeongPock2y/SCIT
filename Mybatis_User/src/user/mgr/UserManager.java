package user.mgr;

import java.util.ArrayList;

import user.dao.UserDAO;
import user.vo.User;

public class UserManager {
	private UserDAO dao = new UserDAO();			//DB���� ó���� �ϴ� Ŭ������ ��ü
		
	//ȸ������ ����
		public boolean insertUser(User user) {
			int cnt = dao.insertUser(user);
			
			if(cnt > 0) {
				return true;
			}
			return false;
		}

		//��ü ȸ�� ���
		public ArrayList<User> listUser() {
			ArrayList<User> list = dao.listUser();
			return list;
		}
}
