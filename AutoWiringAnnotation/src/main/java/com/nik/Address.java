package com.nik;

import org.springframework.beans.factory.annotation.Autowired;

public class Address
{
	private String city;
	private String state;
	//For cyclic dependencies
	/*@Autowired
	Person person;*/
	
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
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

}
