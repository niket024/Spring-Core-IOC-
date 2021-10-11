package com.nik;

import org.springframework.beans.factory.annotation.Autowired;

public class Address
{
	private String city;
	private String state;
	// For cyclic dependencies
	Person person;
	
	@Autowired
	public void setPerson(Person person)
	{
		System.out.println("setPerson");
		this.person = person;
	}

	public Person getPerson()
	{
		return person;
	}

	public Address()
	{
		System.out.println("cons-address");
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		System.out.println("setCity");
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		System.out.println("setState");
		this.state = state;
	}

}
