package com.nik;

public class Person
{
	private int id;
	private String fname;
	private String lname;
	Address address;

	public Person(int id, String fname, String lname, Address address)
	{
		System.out.println("con-person");
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "id=" + id + "fname=" + fname + "lname=" + lname + "Address="
				+ address;
	}

}
