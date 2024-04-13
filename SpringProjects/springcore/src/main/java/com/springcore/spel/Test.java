package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo d = context.getBean("demo", Demo.class);
		System.out.println(d);
		
		
		
		SpelExpressionParser sp = new SpelExpressionParser();
		Expression exp = sp.parseExpression("22+44");
		System.out.println(exp.getValue());
		
		
	}
}
