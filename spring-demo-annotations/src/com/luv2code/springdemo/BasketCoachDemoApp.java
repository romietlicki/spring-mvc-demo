package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasketCoachDemoApp {

	public static void main(String[] args) {
		
		//Load the spring configuration from java class
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasketCoachConfig.class);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//load the bean from spring context
		BasketCoach basketCoach = context.getBean("basketCoach", BasketCoach.class);
		
		//print the data from the bean
		System.out.println(basketCoach.getDailyFortune());
		
		System.out.println(basketCoach.getDailyWorkout());

	}

}
