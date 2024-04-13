package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ap = new AnnotationConfigApplicationContext(JavaConfig.class);
		Result rs = ap.getBean("report", Result.class);
		rs.displayResult();
		ap.close();
	}

	
		
		
}
