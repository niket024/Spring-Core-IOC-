package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
	private static ApplicationContext applicationContext;

	public static void main(String[] args)
	{
		applicationContext = new ClassPathXmlApplicationContext(
				"config.xml");
		A a1 = applicationContext.getBean("a1", A.class);
		B b1 = applicationContext.getBean("b1", B.class);
		
		a1.setB(b1);
		b1.setA(a1);
		System.out.println("done");
		

	}
}
