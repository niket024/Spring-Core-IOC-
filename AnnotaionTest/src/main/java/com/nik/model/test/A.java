package com.nik.model.test;

import org.springframework.beans.factory.annotation.Autowired;

public class A
{
	public A()
	{
		System.out.println("A initialized");
	}

	@Autowired
	private B b1;
	@Autowired
	private C c1;

	public void doSomething()
	{
		System.out.println("Inside doSomething() method of 'A' bean.");
		b1.doSomething();
		c1.doSomething();
	}
}
