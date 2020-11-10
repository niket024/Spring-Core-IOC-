package com.nik.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User
{
	
	int id;
	
	public User(int id)
	{
		this.id=id;
	}

	@PostConstruct
	public void init()
	{
		System.out.println("init");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy");
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
}
