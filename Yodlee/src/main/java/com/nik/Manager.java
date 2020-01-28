package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Person p1 = context.getBean("p1", Person.class);
		System.out.println(p1.getId());
		System.out.println(p1.getfName());
		System.out.println(p1.getlName());
		System.out.println(p1.getAge());
		A a1 = context.getBean("a1", A.class);
		System.out.println(a1);

	}
}
