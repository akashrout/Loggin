package com.login.databases;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.login.databasesutil.DbConnectionProvider;
import com.login.model.User;

public class UserDaoImpl implements UserDao {
	String sql=null;
	String sql1=null;
	//String sql2=null;
	PreparedStatement preparedStatement=null;
	private String password;
	private String username;
	Boolean bo=false;


	@Override
	//public List<User> addintoDB() {
		// TODO Auto-generated method stub
//		try(Connection con=DbConnectionProvider.getConnection()){
//			//Statement stmt=con.createStatement();
//			sql=" insert into USER (ID, FASTNAME,LASTNAME,ADDRESS,EMAIL)"
//			        + " values (?, ?, ?, ?, ?)";
//			preparedStatement=con.prepareStatement(sql);
//			preparedStatement.setString(1, );
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
	//}

//	@Override
	public void createUser(User user) {
		
		try(Connection con=DbConnectionProvider.getConnection()){
			//Statement stmt=con.createStatement();
			sql=" insert into USER (ID, FASTNAME,LASTNAME,ADDRESS,EMAIL,PASSWORD)"
			        + " values (?, ?, ?, ?, ?,?)";
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,user.getId());
			preparedStatement.setString(2, user.getFastname());
			preparedStatement.setString(3, user.getLastname());
			preparedStatement.setString(4, user.getAddress());;
			preparedStatement.setString(5, user.getEmail());
			preparedStatement.setString(6, user.getPassword());
			preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void inserttoDB(User user) {
		// TODO Auto-generated method stub
		try(Connection con=DbConnectionProvider.getConnection()){
			//Statement stmt=con.createStatement();
//			sql=" insert into USER (ID, FASTNAME,LASTNAME,ADDRESS,EMAIL)"
//			        + " values (?, ?, ?, ?, ?)";
//			preparedStatement=con.prepareStatement(sql);
//			preparedStatement.setString(1,user.getId());
//			preparedStatement.setString(2, user.getFastname());
//			preparedStatement.setString(3, user.getLastname());
//			preparedStatement.setString(4, user.getAddress());;
//			preparedStatement.setString(5, user.getEmail());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return ;
		
	}

	@Override
	public boolean validateuser(String username, String password) {
		// TODO Auto-generated method stub
		this.username=username;
		this.password=password;
		try(Connection con=DbConnectionProvider.getConnection()) {
			Statement statement=null;
			sql1="select * from USER where FASTNAME='"+username+"' and PASSWORD='"+password+"'";
			// +"and PASSWORD="++;
			statement=con.createStatement();//
			//sql1="select * from USER where ID=? and FASTNAME=?";
			con.prepareStatement(sql1);
//			preparedStatement.setString(1, username);
//			preparedStatement.setString(2, password);
			
			ResultSet rs=statement.executeQuery(sql1);
			while(rs.next()) {
				bo=true;
//				int id=rs.getInt("username");
//				String name=rs.getString("password");
			}
			
			//rs.next();
			//bo=rs.next();
			
			//while (rs.next()) {
				//bo=true;
//				String uname=rs.getString("password");
//				String pass=rs.getString("password");
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//				if (password.equals(rs.getString("password"))) {
//					bo=true;
//				}
			}
			
//			sql2="select * from USER where PASSWORD=?";
//			preparedStatement=con.prepareStatement(sql2);
//			preparedStatement.setString(1, password);
			//rs=preparedStatement.executeQuery();
			
			
		catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		return bo;
	}

	@Override
	public boolean validateemailaddress(String mail) {
		// TODO Auto-generated method stub
		boolean email=true;
		try (Connection con=DbConnectionProvider.getConnection()){
			Statement statement=null;
			String sql="select * from USER where EMAIL='"+mail+"'";
			statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()) {
				email=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return email;
	}

	
	


}
