package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Employee emp = (Employee)context.getBean("emp");
		System.out.println(emp);
		Addition a = (Addition) context.getBean("add");
		a.doSum();
		

	}

}
