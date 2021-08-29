package com.gl.itadmin.demo;

import java.util.Scanner;

import com.gl.itadmin.beans.Department;
import com.gl.itadmin.beans.Employee;
import com.gl.itadmin.services.EmployeeServiceImpl;
import com.gl.itadmin.services.IEmployeeService;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		IEmployeeService empSvc = new EmployeeServiceImpl();
		
		System.out.println("Please Enter your FirstName");
		String firstName = sc.next();
		System.out.println("Please Enter your LastName");
		String lastName = sc.next();
		System.out.println("Enter password length");
		int length = sc.nextInt();
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical \n2. Admin \n3. HR \n4. Legal");
		int depId = sc.nextInt();
		String department = null;
		switch (depId) {
		case 1:
			department= "Technical";
			break;
		case 2:
			department= "Admin";
			break;
		case 3:
			department= "HR";
			break;
		case 4:
			department="Legal";
			break;
		
		}
		Employee emp = new Employee(firstName, lastName, department);		
		emp.setEmailId(empSvc.generateEmail(emp));
		emp.setPassword(empSvc.generatePassword(length));
		System.out.println(">>>>>Please find your Credentials below<<<<<<");
		System.out.println(emp.showCredentials());		
	}

}
