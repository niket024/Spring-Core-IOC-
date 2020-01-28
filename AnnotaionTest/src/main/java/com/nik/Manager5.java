package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.PropertyConfig;

public class Manager5
{
	private static ApplicationContext applicationContext;

	public static void main(String[] args)
	{
		applicationContext = new AnnotationConfigApplicationContext(
				PropertyConfig.class);
		System.out.println(applicationContext.getBean("helloAgain"));
		// Here You are getting a value from environment Variables which I have
		// set in eclipse
		// Spring gives more priority to environment variables that properties
		// files
	}
}
