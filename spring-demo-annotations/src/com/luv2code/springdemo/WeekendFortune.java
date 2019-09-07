package com.luv2code.springdemo;

public class WeekendFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "You will have a sunny weekend today";
	}

}
