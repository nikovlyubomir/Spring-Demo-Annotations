package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService=theFortuneService;
	} */
	
	
	public TennisCoach() {
		System.out.println("Inside the default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getCoachName() {
		
		return "Yordan";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	//setter
	
	/*
	@Autowired
	public void doSomething(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

}
