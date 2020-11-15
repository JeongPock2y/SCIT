package student.mgr;

import java.util.ArrayList;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentManager {
	StudentDAO dao = new StudentDAO();
	
	//학생정보 저장
	public int insert(Student s) {
		int count =dao.insert(s);
		return count;
	}

	//전체 읽기
	public ArrayList<Student> selectAll() {
		return dao.selectAll();
	}

	//학생정보 삭제
	public int delete(String id) {
		int count=dao.delete(id);
		return count;
	}
	
	//학생정보 수정
	public int update(Student s) {
		int count=dao.update(s);
		return count;
	}
	
	//  이름 사용하여 읽기
	public ArrayList<Student> selectName(String name) {
		return dao.selectName(name);
	}


}
