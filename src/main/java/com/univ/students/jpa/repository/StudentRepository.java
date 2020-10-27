package com.univ.students.jpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.univ.students.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	@Query("select re from Student re where re.id=:studentid")
	public Student getStudentsById(@Param("studentid") int id);
	
	@Query("select re from Student re ")
	public List<Student> getStudentsAll();
		
}
