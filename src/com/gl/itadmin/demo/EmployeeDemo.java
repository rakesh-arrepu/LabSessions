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
		System.out.println(emp);		
		emp.setEmailId(empSvc.generateEmail(emp));
		System.out.println("Email Id is generated");
		System.out.println(emp);
		emp.setPassword(empSvc.generatePassword());
		System.out.println("password is generated");
		System.out.println(emp);
		System.out.println(emp.showCredentials());		
	}

}
