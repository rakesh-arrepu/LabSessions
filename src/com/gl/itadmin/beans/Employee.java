package com.gl.itadmin.beans;

public class Employee {
	
	private String firstName;
	private String lastName;
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", emailId=" + emailId + ", password=" + password + "]";
	}
	private String department;
	private String emailId;
	private String password;
	public Employee(String firstName, String lastName, String department) {
		this.firstName =firstName;
		this.lastName = lastName;
		this.department = department;
	}
	
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String showCredentials() {
		return "Your generated Email Id is - "+this.getEmailId()+"\n Password is - "+this.getPassword();
	}
	

}
