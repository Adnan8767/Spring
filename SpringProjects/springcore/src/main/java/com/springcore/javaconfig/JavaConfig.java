package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	//Creating a bean with multiple names
	@Bean(name = {"result","marksheet","report"})
	public Result getResult() {
		return new Result(getStudent());
	}
	
	@Bean(name = "student")
	public Student getStudent() {
		return new Student();
	}
}
