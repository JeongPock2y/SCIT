package student.mgr;

import java.util.ArrayList;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentManager {
	StudentDAO dao = new StudentDAO();
	
	//�л����� ����
	public int insert(Student s) {
		int count =dao.insert(s);
		return count;
	}

	//��ü �б�
	public ArrayList<Student> selectAll() {
		return dao.selectAll();
	}

	//�л����� ����
	public int delete(String id) {
		int count=dao.delete(id);
		return count;
	}
	
	//�л����� ����
	public int update(Student s) {
		int count=dao.update(s);
		return count;
	}
	
	//  �̸� ����Ͽ� �б�
	public ArrayList<Student> selectName(String name) {
		return dao.selectName(name);
	}


}
