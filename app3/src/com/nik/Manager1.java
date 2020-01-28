package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager1
{
	private static ApplicationContext c1;

	public static void main(String[] args)
	{
		c1 = new ClassPathXmlApplicationContext(
				"config.xml");
		Person p1 = (Person) c1.getBean("p1");
		System.out.println(p1.getId());
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
		System.out.println(p1.getAddress().getCity());
		System.out.println(p1.getAddress().getState());
		System.out.println("done");
	}
}
