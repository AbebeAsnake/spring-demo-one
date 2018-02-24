package me.abebe.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationcontext.xml") ;
	
		
	// retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		//lets call our new method fortunes
		System.out.println(theCoach.getDailyFortune());
		//close context
		context.close();

	}

}
