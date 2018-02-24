package me.abebe.springdemo;

public class CricketCoach implements Coach {
//add new fields for emailaddress and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("cricketCoach : inisde setter method - setEmailAddress");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricketCoach : inisde setter method - setTeam");

		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("cricketCoach : inisde setter method - setFortuneService");
	}

public CricketCoach() {
		System.out.println("cricketCoach : inisde no-arg constructor");
	}

private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		
		return "practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
