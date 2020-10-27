package com.univ.students.model;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id;
	private String fname;
	private String lname;
	private String major;
	private String college;
	private LocalDateTime created_date;
	
	public Student() {
	}
	
	public Student(int id, String fname, String lname, String major, String college, LocalDateTime created_date) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.major = major;
		this.college = college;
		this.created_date = created_date;
	}
	
	public Student(String fname, String lname, String major, String college, LocalDateTime localDateTime) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.major = major;
		this.college = college;
		this.created_date = localDateTime;
		
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = java.time.LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
