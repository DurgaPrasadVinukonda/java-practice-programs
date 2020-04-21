package springdemoannotationpackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// part -1@Component("thatSillyCoach")
@Component

public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	@Autowired
	
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public String  getDailyWorkout() {
	return "Practice backhand volley";

}
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}


	
}
