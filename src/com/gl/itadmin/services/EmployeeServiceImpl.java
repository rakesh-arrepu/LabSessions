package com.gl.itadmin.services;

import java.util.Random;

import com.gl.itadmin.beans.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public String generatePassword(int length) {
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		return sb.toString();
	}

	@Override
	public String generateEmail(Employee employee) {
		return employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartment() + ".gl.com";
	}

}
