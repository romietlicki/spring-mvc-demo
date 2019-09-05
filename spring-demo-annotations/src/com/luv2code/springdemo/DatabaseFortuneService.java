package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author e074953 Rodrigo
 *
 */
@Component
public class DatabaseFortuneService implements FortuneService {
	
	//retrieve the fortunes from the properties file and add it into the array
	@Value("${foo.fortune}")
	private String [] fortunes;
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length);
		String fortune = fortunes[index];
		
		return fortune;
	}

}
