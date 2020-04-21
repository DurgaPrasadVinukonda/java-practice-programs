package springdemo;

public class TrackCoach implements Coach {
	
	//Private Variable
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;

	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a Hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it"+fortuneService.getFortune();
	}
	
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
     // add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}
}
