package com.nik;

public class Person
{
	public Person()
	{
		System.out.println("Person cons");
	}

	private int id;
	private String fName;
	private String lName;
	private int age;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		System.out.println("setid");
		this.id = id;
	}

	public String getfName()
	{
		return fName;
	}

	public void setfName(String fName)
	{
		this.fName = fName;
	}

	public String getlName()
	{
		return lName;
	}

	public void setlName(String lName)
	{
		this.lName = lName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}
