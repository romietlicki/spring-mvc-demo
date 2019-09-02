package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author e074953 Rodrigo
 *
 */
@Component
@Scope("singleton") //scope can be either prototype or singleton NOTE: the default scope is: singleton and can be implicit
public class TennisCoach implements Coach {
	
	//instead of using constructor injection or setter injection you can use the field injection with Autowired.
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	//retrieving the values from the fortune.properties file and inserting into this array
	@Value("${foo.fortune}")
	private String [] fortunes;
	
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

	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("TennisCoach: >> inside doMyStartupStuff() method");
		
		//loading the array and printing the values
		for(int i = 0; i < fortunes.length ; i++){
		System.out.println(fortunes[i]);	
		}
		
	}
	
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("TennisCoach: >> inside doMyCleanupStuff() method");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
