package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// We used AbstractApplicationContext here instead of ApplicationContext because
		// ApplicationContext is child interface of class used below and it does not
		// have registerShutdownHook method
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		// This will call destroy method
		context.registerShutdownHook();

		// Samosa class has XML based bean lifecycle implementation, check config file
		// for understanding
		Samosa s = (Samosa) context.getBean("s1");
		System.out.println(s);

		// Pepsi class has interface based bean lifecycle implementation, check Pepsi
		// class file for understanding
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println("========================================");
		System.out.println(p);

		// Pepsi class has annotation based bean lifecycle implementation, check jalebi
		// class file for understanding
		Jalebi j = (Jalebi) context.getBean("j1");
		System.out.println("========================================");
		System.out.println(j);

	}
}
