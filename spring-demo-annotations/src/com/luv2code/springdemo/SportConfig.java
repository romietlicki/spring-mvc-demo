package com.luv2code.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author e074953 Rodrigo
 *
 */
//creating the spring configuration without xml, using the component scan directly in java code
@Configuration
@ComponentScan("com.luv2code.springdemo") 
public class SportConfig {

	@PostConstruct
	public void startSpringConfiguration(){
		System.out.println(" >> Starting spring configuration without xml...");
	}
	
}
