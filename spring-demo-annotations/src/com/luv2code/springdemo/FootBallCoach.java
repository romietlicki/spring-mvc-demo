package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public FootBallCoach(FortuneService theFortuneService){
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
