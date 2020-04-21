package springdemoannotationpackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//Read the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get bean from the spring container
		//Coach thecoach =context.getBean("thatSillyCoach",Coach.class);
		//Part-2 -Automatic bean id calling 
		Coach thecoach =context.getBean("tennisCoach",Coach.class);
		//Call a method  on bean 
		System.out.println(thecoach.getDailyWorkout());
		// close the context
		
		System.out.println(thecoach.getDailyFortune());
		context.close();

	}

}
