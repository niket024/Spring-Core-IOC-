package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager1
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person p1 = (Person) context.getBean("p1");
		int id = p1.getId();
		String fname = p1.getfName();
		String lname = p1.getlName();
		int age = p1.getAge();
		System.out.println("id=" + id);
		System.out.println("fname=" + fname);
		System.out.println("lname=" + lname);
		System.out.println("age=" + age);
	}
}
