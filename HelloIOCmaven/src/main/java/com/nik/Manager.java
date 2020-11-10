package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("config.xml");
		/*Person person = (Person) context.getBean("p1");
		System.out.println(person.getId());
		System.out.println(person.getFname());
		System.out.println(person.getLname());
		System.out.println(person.getAge());*/
	}
}
