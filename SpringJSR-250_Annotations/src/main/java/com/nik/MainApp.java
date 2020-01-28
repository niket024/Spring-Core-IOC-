package com.nik;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	private static AbstractApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext(
				"config.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
	}
}