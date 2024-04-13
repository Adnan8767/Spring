package com.springcore.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml"); 
		context2.registerShutdownHook();
		Emp e = context2.getBean("emp", Emp.class);
		System.out.println(e.toString());
	}
	
}
