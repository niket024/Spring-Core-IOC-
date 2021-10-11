package com.nik;

public class Person
{
	private int id;
	private String fname;
	private String lname;
	private int age;

	public Person()
	{
		System.out.println("Object Person created");
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

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname
				+ ", age=" + age + "]";
	}

}
