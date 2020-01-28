package com.nik.resource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getCompany().getCompName());
		context.close();
	}
}