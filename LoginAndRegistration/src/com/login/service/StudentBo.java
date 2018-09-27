package com.login.service;

import java.util.List;

import com.login.model.Student;

public interface StudentBo {
	List<Student> getAllStudents();
	public void insertStudent(Student student);

}
