package com.gl.itadmin.services;

import com.gl.itadmin.beans.Employee;

public interface IEmployeeService {

	public String generatePassword();
	public String generateEmail(Employee employee);
}
