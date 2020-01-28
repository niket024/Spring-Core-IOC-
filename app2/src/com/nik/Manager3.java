package com.nik;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager3
{
	private static ClassPathXmlApplicationContext c1;

	public static void main(String[] args)
	{
		c1 = new ClassPathXmlApplicationContext("emp.xml");
		Employee emp1 = (Employee) c1.getBean("emp1");
		System.out.println(emp1.getId());
		System.out.println(emp1.getFname());
		System.out.println(emp1.getLname());
		System.out.println(emp1.getWeight());
		System.out.println(emp1.getSalary());
		System.out.println(Arrays.toString(emp1.getMail()));
		System.out.println(emp1.getLovers());
		System.out.println(emp1.getMobileno());
		System.out.println(emp1.getEducation());
		System.out.println("done");

	}
}
