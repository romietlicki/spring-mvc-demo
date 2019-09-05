package com.luv2code.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author e074953 Rodrigo
 *
 */
//creating the spring configuration without xml, using the component scan directly in java code
@Configuration
//@ComponentScan("com.luv2code.springdemo") since we are using the @Bean annotations, the @ComponentScan is no longer needed.
@PropertySource("classpath:sport.properties") // this annotation will retrieve the properties file just like in the xml config
public class SportConfig {

	@PostConstruct
	public void startSpringConfiguration(){
		System.out.println(" >> Starting spring configuration without xml...");
	}
	
	//define bean for the SadFortuneService
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	//define bean for the Swim coach and inject the dependency
	@Bean
	public SwimCoach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
	
	
}
