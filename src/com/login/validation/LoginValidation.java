package com.login.validation;

public class LoginValidation {
	public boolean verifyFastName(String fname) {
		fname=fname.trim();
		if(fname == null)
	        return false;

	    if(!fname.matches("[a-zA-Z]*"))
	        return false;
	    if (fname.length()<5) {
			return false;
		}
		return true;
		
	}
	public boolean VerifyLastName(String lname) {
		lname=lname.trim();
		if(lname == null)
	        return false;

	    if(!lname.matches("[a-zA-Z]*"))
	        return false;
	    if (lname.length()<4) {
			return false;
		}
		return true;
	}
	public boolean VarifyEmailAddress(String name) {
		
		return false;
		
	}

}
