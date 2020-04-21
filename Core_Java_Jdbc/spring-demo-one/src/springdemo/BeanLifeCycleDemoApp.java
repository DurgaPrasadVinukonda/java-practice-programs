package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
	//retrieve bean from spring container
		Coach theCoach =context.getBean("myCoach",Coach.class);
		
		
		//Checking whether they are same (Means checking their object references)
		System.out.println(theCoach.getDailyWorkout());
		
		
		
		context.close();
		
	
	}
	

}
