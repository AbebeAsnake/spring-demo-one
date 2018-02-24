package me.abebe.springdemo;

public class HaappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "today is ur lucky day";
	}

}
