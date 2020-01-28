package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.DbConfig;
import com.nik.appconfig.OtherConfig;
import com.nik.model.Ecommerce;
import com.nik.model.Product;

public class Manager2
{
	private static ApplicationContext applicationContext;

	public static void main(String[] args)
	{
		applicationContext = new AnnotationConfigApplicationContext(
				OtherConfig.class);

		System.out.println(applicationContext.getBean("eCommerce",Ecommerce.class)
				.getCategories() == null ? "Null" : "Ecommerce");

	}
}
