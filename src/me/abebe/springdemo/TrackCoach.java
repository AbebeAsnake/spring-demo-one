package me.abebe.springdemo;

public class TrackCoach implements Coach {
public TrackCoach() {
		
	}

public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add destro method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
