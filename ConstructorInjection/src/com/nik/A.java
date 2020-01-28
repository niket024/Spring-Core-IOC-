package com.nik;

public class A
{
	String param1;
	String param2;

	public A(String param1, String param2)
	{
		System.out.println("A(string)");
		this.param1 = param1;
		this.param2 = param2;
	}

	@Override
	public String toString()
	{
		return "param1=" + param1 + "  param2=" + param2;
	}
}
