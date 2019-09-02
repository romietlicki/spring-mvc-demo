package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//retrieve the spring context from file config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//retrieve the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach theAlphaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean result = (theCoach == theAlphaCoach);
		
		System.out.println("Pointing to the same object: "+result);
		
		System.out.println("Memory location for theCoach: "+theCoach);
		
		System.out.println("Memory location for theAlphaCoach: "+theAlphaCoach);
		
		//close the context
		context.close();
		
		
		

	}

}
