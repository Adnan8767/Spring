package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Result {
	public Result(Student student) {
		super();
		this.student = student;
	}

	@Value("#{new java.lang.Double(85)}")
	private Double marks;
	
	private Student student;

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void displayResult() {
		System.out.println(	String.format("The result of %s is %s",student.getName(), marks.toString()+"%"));
	
	}
}
