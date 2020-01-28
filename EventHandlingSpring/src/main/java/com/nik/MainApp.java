package com.nik;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");

		// Let us raise a start event.
		context.start();

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.refresh();
		// Let us raise a stop event.
		context.stop();
		context.close();

	}
}