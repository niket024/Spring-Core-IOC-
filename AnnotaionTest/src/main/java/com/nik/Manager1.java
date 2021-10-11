package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.AppCongig;

public class Manager1
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext(AppCongig.class);
		System.out.println(context.getBean("u1") == null ? "Null" : "Ok");

	}
}
