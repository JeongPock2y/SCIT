package student.mgr;

import java.util.ArrayList;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentManager {
	StudentDAO dao = new StudentDAO();
	
	//�л����� ����
	public int insert(Student s) {
		return dao.insert(s);
		
	}

//	//��ü �б�
//	public ArrayList<Student> selectAll() {
//		
//	}
//
//	//�л����� ����
//	public int delete(String id) {
//		
//	}
//	
//	//�л����� ����
//	public int update(Student s) {
//		
//	}
//	
//	//��ü �б�
//	public ArrayList<Student> selectName(String name) {
//		
//	}
	
}
