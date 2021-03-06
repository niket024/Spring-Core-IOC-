package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Util
{
	private static ClassPathXmlApplicationContext context;
	static {
		context = new ClassPathXmlApplicationContext("config.xml");
	}

	public static Object getBean(String id)
	{
		return context.getBean(id);
	}

	public static void destroy(String id)
	{
		context.registerShutdownHook();

	}
}
