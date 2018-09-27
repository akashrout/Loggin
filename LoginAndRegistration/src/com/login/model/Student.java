package com.login.model;

public class Student {
	private String id;
	private String FastName;
	private String LastName;
	private String RollNo;
	private String Branch;
	public Student(String id, String fastName, String lastName, String rollno, String branch) {
		super();
		this.id = id;
		FastName = fastName;
		LastName = lastName;
		RollNo = rollno;
		Branch = branch;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFastName() {
		return FastName;
	}
	public void setFastName(String fastName) {
		FastName = fastName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	

}
