package democlass;


public class TrackCoach implements Coach{
	public String getDailyWorkout() {
		return "This is a TrackCoach Class";
	}

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		

	}

}
