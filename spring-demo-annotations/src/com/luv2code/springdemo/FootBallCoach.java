package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootBallCoach(){
		
	}
	
	//Using constructor injection with @Qualifier annotation to retrieve the specific fortuneService implementation
	@Autowired
	public FootBallCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Train Penalty every Thursday and Friday";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
