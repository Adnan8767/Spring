package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("#{new java.lang.String('Anuj')}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
