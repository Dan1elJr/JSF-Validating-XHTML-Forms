package com.love2code.jsf.validatedemo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	
	private String firstName;
	private String lastName;
	private String freePasses;
	private int postalCode;
	
	
	public StudentTwo() {}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFreePasses() {
		return freePasses;
	}


	public void setFreePasses(String freePasses) {
		this.freePasses = freePasses;
	}


	public int getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
	
	
	

}
