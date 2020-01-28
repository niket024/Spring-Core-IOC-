package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		ApplicationContextAwareTest appcontext = (ApplicationContextAwareTest) context
				.getBean("appcontext");
		ApplicationContext appCon = appcontext.getContext();
		A a = (A) appCon.getBean("a1");
		a.doTask();
		B.main(null);
		context.close();
	}
}