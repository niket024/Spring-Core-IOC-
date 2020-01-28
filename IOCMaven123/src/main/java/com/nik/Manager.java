package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Product product = (Product) context.getBean("p1");
		Product product1 = (Product) context.getBean("p1");
		Categories categories = (Categories) context.getBean("c1");
		Categories categories1 = (Categories) context.getBean("c1");

		/*System.out.println(product);
		Categories categories = (Categories) context.getBean("c1");
		System.out.println(categories);*/
		/*System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getDesc());
		System.out.println("done");*/
		context.close();
	}
}
