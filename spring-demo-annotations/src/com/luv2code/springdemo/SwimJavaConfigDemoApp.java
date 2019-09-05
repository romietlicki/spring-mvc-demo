package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class); 
		
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method for the fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call the method for email has the props values injected
		System.out.println("email: " + theCoach.getEmail());
		
		//call the method for team has the props values injected
		System.out.println("team: "+ theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
