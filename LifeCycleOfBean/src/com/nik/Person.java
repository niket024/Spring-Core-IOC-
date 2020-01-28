package com.nik;


public class Person
{
	private String fname;
	private String lname;
	private int age;
	private String address;

	public Person()
	{
		System.out.println("constructor");
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		System.out.println("setFname");
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		System.out.println("setLname");

		this.lname = lname;
	}

	public int getAge()
	{

		return age;
	}

	public void setAge(int age)
	{
		System.out.println("getAge");

		this.age = age;
	}

	public String getAddress()
	{

		return address;
	}

	public void setAddress(String address)
	{
		System.out.println("setAddress");

		this.address = address;
	}

	public void myInit()
	{
		System.out.println("myInit");
	}

	public void myRelease()
	{
		System.out.println("myrelease");
	}

}
