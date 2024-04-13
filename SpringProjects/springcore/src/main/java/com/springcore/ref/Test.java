package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/ref/configReference.xml");
		A a = (A)ap.getBean("aref");
		System.out.println(a);
		System.out.println(a.getOb().getY());
		

	}

}
