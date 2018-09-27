package com.login.model;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import com.sun.javafx.collections.MappingChange.Map;

public class User implements HttpSessionBindingListener{
	private static Map<User, HttpSession> login = (Map<User, HttpSession>) new HashMap<User, HttpSession>();

	private String id;
	private String fastname;
	private String lastname;
	private String address;
	private String email;
	private String password;
	public User(String id, String fastname, String lastname, String address, String email, String password) {
		super();
		this.id = id;
		this.fastname = fastname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fastname == null) ? 0 : fastname.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fastname == null) {
			if (other.fastname != null)
				return false;
		} else if (!fastname.equals(other.fastname))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFastname() {
		return fastname;
	}
	public void setFastname(String fastname) {
		this.fastname = fastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session = ((HashMap<User, HttpSession>) login).remove(this);
        if (session != null) {
            session.invalidate();
        }
        ((HashMap<User, HttpSession>) login).put(this, arg0.getSession());
		
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		 ((HashMap<User, HttpSession>) login).remove(this);
		
	}
	
}
