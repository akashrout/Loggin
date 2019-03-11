package com.login.databasesutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionProvider {
	
	public static Connection getConnection() {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "admin");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
	
			e.printStackTrace();
		}
		
		return con;
		
	}

}
