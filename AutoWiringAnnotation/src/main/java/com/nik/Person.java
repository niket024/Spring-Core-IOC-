package com.nik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person
{
	private int id;
	private String fname;
	private String lname;
	/*@Autowired
	// To achive autowired by name uncomment it. By default it is by type
	@Qualifier("address2")*/
	@Autowired
	//@Qualifier("address2")
	Address address;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
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

	public Address getAddress()
	{
		return address;
	}
	//@Autowired
	public void setAddress(Address address)
	{
		this.address = address;
	}

}
