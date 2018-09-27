package com.login.databases;

import java.util.List;

import com.login.model.Student;
import com.login.model.StudentGetSet;

public interface StudentDao {
	List<Student> getAllStudentInfo();
	public void insertStudentIntoDb(Student student);
	public boolean ValidateUserName(String fname);
	public boolean deleteByFastName(String fname);
	//public int updateStudent(Student student);
	//public static Student getid(String id);
	public StudentGetSet getStudentById(String id);
	public int update(Student student);
	List<Student> getStudentBySearch(String name);
	//public StudentGetSet getStudentBySearch(String fname);
	
	

}
