package com.gl.itadmin.services;

import com.gl.itadmin.beans.Employee;

public interface IEmployeeService {

	public String generatePassword(int length);
	public String generateEmail(Employee employee);
}
