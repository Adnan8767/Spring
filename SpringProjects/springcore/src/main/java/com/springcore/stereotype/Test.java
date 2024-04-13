package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml"); 
		context2.registerShutdownHook();
		Student s = context2.getBean("student", Student.class);
		Student s2 = context2.getBean("student", Student.class);
		System.out.println(s);
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
	}	
	
}
