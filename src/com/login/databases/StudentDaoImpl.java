package com.login.databases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.login.databasesutil.DbConnectionProvider;
import com.login.model.Student;
import com.login.model.StudentGetSet;

public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> getAllStudentInfo() {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		try(Connection con=DbConnectionProvider.getConnection()) {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from STUDENT");
			
			while(rs.next()) {
				Student student=new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				students.add(student);
			}	
				
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public void insertStudentIntoDb(Student student) {
		try (Connection con=DbConnectionProvider.getConnection()){
			String sql="insert into STUDENT(ID,FASTNAME,LASTNAME,ROLLNUMBER,BRANCH)"
					  + " values (?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1, student.getId());
			preparedStatement.setString(2, student.getFastName());
			preparedStatement.setString(3, student.getLastName());
			preparedStatement.setString(4, student.getRollNo());
			preparedStatement.setString(5, student.getBranch());
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ValidateUserName(String fname) {
		// TODO Auto-generated method stub
		boolean fastname=true;
		try (Connection con=DbConnectionProvider.getConnection()){
			String sql="select * from STUDENT where FASTNAME='"+fname+"'";
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()) {
				fastname=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return fastname;
	}

	@Override
	public boolean deleteByFastName(String fname) {
		// TODO Auto-generated method stub
		//int count=0;
		boolean status=false;
		try (Connection con=DbConnectionProvider.getConnection()){
			
			String sql="delete from STUDENT where FASTNAME='"+fname+"'";
				Statement statement=con.createStatement();
				 int rs =statement.executeUpdate(sql);
			 if(rs>0) {
				 status=true;
			 }
		} catch (Exception e) {
			// TODO: handle exception
		} 
		return status;
	}




	@Override
	public StudentGetSet getStudentById(String id) {
		// TODO Auto-generated method stub
		StudentGetSet student=new StudentGetSet();
		try (Connection con=DbConnectionProvider.getConnection()){
			String sql="select * from STUDENT where ID='"+id+"'"; 
			Statement statement=con.createStatement();
			 ResultSet rs =statement.executeQuery(sql);
			 while(rs.next()) {
					
					
						student.setId(rs.getString(1));
						 student.setFastName(rs.getString(2));
						 student.setLastName(rs.getString(3));
						 student.setRollNo(rs.getString(4));
						 student.setBranch(rs.getString(5));
						
					}
		}catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		return student;
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		int status=0;  
        try(Connection con=DbConnectionProvider.getConnection()){  
            PreparedStatement ps=con.prepareStatement(  
                         "update STUDENT set ID=?,FASTNAME=?,LASTNAME=?,ROLLNUMBER=?,BRANCH=? where id=?");  
            ps.setString(1,student.getId());  
            ps.setString(2,student.getFastName());  
            ps.setString(3,student.getLastName());  
            ps.setString(4,student.getRollNo());  
            ps.setString(5,student.getBranch());  
            ps.setString(6, student.getId());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex)
        {ex.printStackTrace();}  
          
        return status;  
     
	}

	@Override
	public List<Student> getStudentBySearch(String name) {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		try(Connection con=DbConnectionProvider.getConnection()) {
		String sql="";
			if(name.isEmpty()) {
				  sql="select * from STUDENT";
			}else {
				sql="select * from STUDENT where FASTNAME LIKE '%"+name+"%'";
			}
			  
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()) {
				
				Student student=new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//				student.setId(rs.getString(1));
//				 student.setFastName(rs.getString(2));
//				 student.setLastName(rs.getString(3));
//				 student.setRollNo(rs.getString(4));
//				 student.setBranch(rs.getString(5));;
				 students.add(student);
				 
				
			}
		
		
	}catch (Exception e) {
		// TODO: handle exception
	}return students;


	}}



	

	

