package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager2
{
public static void main(String[] args)
{
	ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext(
			"application.xml");
	Person p1 = (Person) c1.getBean("p1");
	System.out.println("done");
}
}
