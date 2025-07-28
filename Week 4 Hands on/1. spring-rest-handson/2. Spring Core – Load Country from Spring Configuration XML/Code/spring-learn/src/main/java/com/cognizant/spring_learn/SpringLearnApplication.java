package com.cognizant.spring_learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

	public static void main(String[] args) {
		System.out.println("Inside main"); // This will ALWAYS print
		displayCountry();
	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		System.out.println(">>> Loaded country: " + country); // This will show result
	}
}
