package student.mgr;

import java.util.ArrayList;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentManager {
	StudentDAO dao = new StudentDAO();
	
	//학생정보 저장
	public int insert(Student s) {
		return dao.insert(s);
		
	}

//	//전체 읽기
//	public ArrayList<Student> selectAll() {
//		
//	}
//
//	//학생정보 삭제
//	public int delete(String id) {
//		
//	}
//	
//	//학생정보 수정
//	public int update(Student s) {
//		
//	}
//	
//	//전체 읽기
//	public ArrayList<Student> selectName(String name) {
//		
//	}
	
}
