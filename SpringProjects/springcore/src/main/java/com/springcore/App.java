package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;


public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/collections/collectionsConfig.xml");
        Employee s =  (Employee)ap.getBean("Employee1");
        System.out.println(s.getName());
        System.out.println(s.getAddresses());
        System.out.println(s.getPhones());
        System.out.println(s.getCourses());
        System.out.println(s.getExperience());
        
    }
}


