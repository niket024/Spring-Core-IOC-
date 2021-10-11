package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("config.xml");
		Person p1 = context.getBean("p1", Person.class);
		Person p2 = context.getBean("p1", Person.class);
		System.out.println(p1 == p2);
		System.out.println("done");
	}
}
