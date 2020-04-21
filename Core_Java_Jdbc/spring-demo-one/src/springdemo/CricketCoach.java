package springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	//Add new fields
	private String emailaddress;
	private String team;
	
	
	
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		System.out.println("CricketCoach: inside setEmailaddress method");
		this.emailaddress = emailaddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setTeam method");
		this.team = team;
	}
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	//Setter Method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: inside setFortune method");
		
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 min ";
	}


	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
