package com.nik.jsr330;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("config.xml");

		CustomerService cust = (CustomerService) context
				.getBean("customerService");
		cust.save();

	}
}
