package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	//instead of using constructor injection or setter injection you can use the field injection with Autowired.
	@Autowired
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach(){
		System.out.println(">> inside the default constructor");
	}
	
	//defina a constructor injection
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}*/

/*	
	//define a setter injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> inside setFortuneService()");
		this.fortuneService = fortuneService;
	}
*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
