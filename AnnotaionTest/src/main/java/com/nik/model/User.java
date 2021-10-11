package com.nik.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User
{

	int id;

	public User()
	{
		System.out.println("cons");
		// TODO Auto-generated constructor stub
	}

	public User(int id)
	{
		this.id = id;
	}

	@PostConstruct
	public void abc()
	{
		System.out.println("init");
	}

	@PreDestroy
	public void xyz()
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
