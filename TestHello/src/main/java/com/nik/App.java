package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext(AppConfig.class);

		Person p1 = context.getBean(Person.class);
		System.out.println(context.getBean(Person.class) == null ? "Null"
				: "Ok");
	}
}
