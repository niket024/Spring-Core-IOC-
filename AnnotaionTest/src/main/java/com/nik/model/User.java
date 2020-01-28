package com.nik.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User
{

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
}
