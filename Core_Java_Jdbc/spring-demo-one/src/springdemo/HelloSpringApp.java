package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//load the spring configuration file
		//retreive bean from container
		//call methods on bean
		//close the context
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		Coach thecoach =context.getBean("myCoach",Coach.class);
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		context.close();
		
	}

}
