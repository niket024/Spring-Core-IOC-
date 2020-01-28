package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Person p1 = context.getBean("p1", Person.class);
		System.out.println(p1.getId());
		System.out.println(p1.getfName());
		System.out.println(p1.getlName());
		System.out.println(p1.getAge());

		Book b1 = context.getBean("b1", Book.class);
		System.out.println(b1.getId());
		System.out.println(b1.getBookName());
		System.out.println(b1.getPrice());
	}
}
