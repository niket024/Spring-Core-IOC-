package com.nik;

public class Person
{
	private int id;
	private String fName;
	private String lName;
	private int age;

	public Person()
	{
		System.out.println("cons");
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		System.out.println("setId");
		this.id = id;
	}

	public String getfName()
	{
		return fName;
	}

	public void setfName(String fName)
	{
		System.out.println("setfName");
		this.fName = fName;
	}

	public String getlName()
	{
		return lName;
	}

	public void setlName(String lName)
	{
		System.out.println("setlName");
		this.lName = lName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		System.out.println("setAge");
		this.age = age;
	}

}
