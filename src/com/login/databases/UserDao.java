package com.login.databases;

import java.util.List;

import com.login.model.User;

public interface UserDao {
	public void createUser(User user);
	
	public void inserttoDB(User user);
	
	public boolean validateuser(String username,String password);
	public boolean validateemailaddress(String mail);
//	public int deleteByFastName(String fname);

}
