package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager1
{
	private static ClassPathXmlApplicationContext c1;

	public static void main(String[] args)
	{
		c1 = new ClassPathXmlApplicationContext(
				"application.xml");
		Person p1 = (Person) c1.getBean("p1");
		System.out.println(p1.getId());
		System.out.println(p1.getfName());
		System.out.println(p1.getlName());
		System.out.println(p1.getAge());
		System.out.println("-------------");
		Person p2 = (Person) c1.getBean("p1");
		System.out.println(p2.getId());
		System.out.println(p2.getfName());
		System.out.println(p2.getlName());
		System.out.println(p2.getAge());

	}
}
