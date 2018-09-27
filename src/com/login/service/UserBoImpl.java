package com.login.service;

import com.login.databases.UserDao;
import com.login.databases.UserDaoImpl;
import com.login.model.User;

public class UserBoImpl implements UserBo {
	
	private UserDao userDao;
//	private String username;
//	private String password;

	@Override
	public void createUser(User user) {
		
		userDao= new UserDaoImpl();
		userDao.createUser(user);
		

	}

	//@Override
//	public int validateuser(String username, String password) {
//		// TODO Auto-generated method stub
////		this.username=username;
////		this.password=password;
//		userDao= new UserDaoImpl();
//		userDao.validateuser(username,password);
//		
//	}

	

}
