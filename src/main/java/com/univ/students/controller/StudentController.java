package com.univ.students.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.univ.students.model.Student;
import com.univ.students.services.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/services")
@Api("Reporting student application which allow creating new student and update existing student and dose basic crud operations")
public class  StudentController {

	@Autowired
	StudentService  studentService;

	@PostMapping(value = "/student")
	@ApiOperation(value = "Creates new Student with information provided.")
	public Student createStudent(@RequestBody Student studentInfo) {
		return studentService.createStudent(studentInfo);
	}

	@PutMapping("/student/{id}")
	@ApiOperation(value = "Update existing Student with information provided.")
	public Student updateStudent(@PathVariable int id, @RequestBody Student studentInfo) {
		return studentService.updateStudent(id,studentInfo);
	}

	@GetMapping("/students")
	@ApiOperation(value = "Get all existing Students with information provided.")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@DeleteMapping(value = "/student/{id}")
	@ApiOperation(value = "Delete Student By Id")
	public boolean deleteStudent(@PathVariable(value="id") int id) {
		return studentService.deleteStudent(id);
	}
	
}