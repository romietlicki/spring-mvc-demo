package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketCoachConfig {
	
	@Bean
	public FortuneService weekendFortuneService(){
		return new WeekendFortune();
	}
	
	@Bean
	public BasketCoach basketCoach(){
		return new BasketCoach();
	}

}
