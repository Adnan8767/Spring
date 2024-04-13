package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {
	@Value("Aakash")
	private String Name;
	@Value("21")
	private int RollNo;
	
	@Value("#{temp}")
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub

	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", RollNo=" + RollNo + ", address=" + address + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

}