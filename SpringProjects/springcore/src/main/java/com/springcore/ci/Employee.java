package com.springcore.ci;

import java.util.List;

public class Employee {
	String empName;
	int employeeId;
	int age;
	Dept dept;
	List<String> Projects;
	
	public Employee(String emp, int employeeId, int age, Dept dept, List<String> Projects) {
		this.empName = emp;
		this.employeeId = employeeId;
		this.age = age;
		this.dept = dept;
		this.Projects = Projects;
	}
	
	@Override
	public String toString() {
		return this.empName+" : "+this.employeeId+" : "+this.age+"{"+this.dept.Name+"}"+"{"+this.Projects+"}";
	}

}