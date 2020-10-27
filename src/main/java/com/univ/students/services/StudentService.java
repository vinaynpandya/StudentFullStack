package com.univ.students.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.univ.students.jpa.repository.StudentRepository;
import com.univ.students.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository  studentrepository;
	
	/**
	 * Create StudentReport 
	 * @return The StudentsInfo
	 */
	public Student createStudent(Student Studentsinfo) {
		
		//Student newStudent = new Student(Studentsinfo.getId(),Studentsinfo.getFname(),Studentsinfo.getLname(),Studentsinfo.getMajor(),Studentsinfo.getMajor(),Studentsinfo.getCreated_date());
		Student newStudent = new Student(Studentsinfo.getFname(),Studentsinfo.getLname(),Studentsinfo.getMajor(),Studentsinfo.getCollege(),Studentsinfo.getCreated_date());
			
		studentrepository.save(newStudent);
				
		return Studentsinfo;
	}

	/**
	 * Update Student
	 * @return The StudentsInfo
	 */
	public Student updateStudent(int id,Student Studentsinfo) {
		
		Student studententity = new Student(Studentsinfo.getId(),Studentsinfo.getFname(),Studentsinfo.getLname(),Studentsinfo.getMajor(),Studentsinfo.getCollege(),Studentsinfo.getCreated_date());
		
		studententity.setId(id);
		
		studentrepository.save(studententity);
		
		return Studentsinfo;
	}
	
	
	public List<Student> getAllStudents() {		
		//return studentrepository.findAll();
		return studentrepository.getStudentsAll();
	}
	
	/**
	 * Delete specific student by Id  
	 * @return true if deleted successfully
	 */
	public boolean deleteStudent(int studentid) {
		Student studententity = studentrepository.getStudentsById(studentid);
		
		if (studententity == null ) {
			return false;
		}
		else {
			studentrepository.delete(studententity);
			return true;			
		}
	}	
}
