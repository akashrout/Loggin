package com.login.service;

import java.util.List;

import com.login.databases.StudentDao;
import com.login.databases.StudentDaoImpl;
import com.login.model.Student;

public class StudentBoImpl implements StudentBo {
	private StudentDao studentDao;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		studentDao=new StudentDaoImpl();
		List<Student> students=studentDao.getAllStudentInfo();
		return students;
	}

	@Override
	public void insertStudent(Student student) {
		studentDao=new StudentDaoImpl();
		studentDao.insertStudentIntoDb(student);
		// TODO Auto-generated method stub
		
	}

}
