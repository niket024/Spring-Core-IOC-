package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.PropertyConfig;
import com.nik.model.User;

public class Manager4
{
	private static ApplicationContext applicationContext;
	
public static void main(String[] args)
{
	applicationContext = new AnnotationConfigApplicationContext(PropertyConfig.class);
	
	System.out.println(applicationContext.getBean("hello"));
	System.out.println(applicationContext.getBean("user", User.class).getId());

	
}
}
