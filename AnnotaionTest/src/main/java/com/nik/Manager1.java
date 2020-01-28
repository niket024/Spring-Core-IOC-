package com.nik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.AppCongig;

public class Manager1
{
	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext(AppCongig.class);
		System.out.println(context.getBean("getUser") == null ? "Null" : "Ok");
		context.close();
	}
}
