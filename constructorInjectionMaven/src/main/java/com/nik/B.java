package com.nik;

public class B
{
	String param1;
	Integer param2;

	public B(String param1)
	{
		System.out.println("String param1");
		this.param1 = param1;
	}

	public B(Integer param2)
	{
		System.out.println("int param2");
		this.param2 = param2;
	}

	@Override
	public String toString()
	{
		return "B [param1=" + param1 + ", param2=" + param2 + "]";
	}
	
	
}
