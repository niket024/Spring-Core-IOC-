package com.nik;

public class Student
{
	private int rollNo;
	private String name;

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	public int getRollNo()
	{
		return rollNo;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void init()
	{
		System.out.println("init");
	}

	public void destroy()
	{
		System.out.println("destroy");
	}
}
