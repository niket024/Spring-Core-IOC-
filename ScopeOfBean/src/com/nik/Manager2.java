package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager2
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext(
				"config.xml");
		Book b1 = (Book) c1.getBean("b1");
		Book b2 = (Book) c1.getBean("b1");
		/*System.out.println(b1.getId());
		System.out.println(b1.getName());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
		System.out.println("done");*/
	}
}
