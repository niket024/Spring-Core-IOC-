package com.nik;

public class B
{
	public static void main(String[] args)
	{
		
		A a1 = (A) ApplicationContextAwareTest.getContext().getBean("a1");
		a1.doTask();
	}
}
