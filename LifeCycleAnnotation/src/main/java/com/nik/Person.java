package com.nik;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person
{
	public Person()
	{
		System.out.println("Person");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("Something after person object creation");
	}

	@PreDestroy
	public void myDestroy()
	{
		System.out.println("Something after");
	}
}
