package com.nik;

public class Manager1
{
	public static void main(String[] args)
	{
		A a1 = (A) Util.getBean("a1");
		System.out.println(a1);
	}
}
