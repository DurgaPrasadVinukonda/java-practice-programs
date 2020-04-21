package springdemo;

public class BaseballCoach implements Coach {
	//define a private field for  the dependency
	private FortuneService fortuneService;
	//Define a constructor for dependency injection 
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting";
	}

	@Override
	public String getDailyFortune() {
		// dependency helper
		return fortuneService.getFortune();
	}

}
