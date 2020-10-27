package com.univ.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Student {
//Main class comment
	public static void main(String[] args) {
		SpringApplication.run(Student.class, args);
	}
}
