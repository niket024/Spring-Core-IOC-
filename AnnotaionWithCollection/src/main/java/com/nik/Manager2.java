package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.AppCongig;
import com.nik.model.Product1;

public class Manager2
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext(AppCongig.class);
		Product1 product = context.getBean("p1", Product1.class);
		product.printProductList();
	}
}
