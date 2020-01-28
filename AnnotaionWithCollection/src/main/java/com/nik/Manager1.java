package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.AppCongig;
import com.nik.model.Product;

public class Manager1
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext(AppCongig.class);
		Product product = context.getBean(Product.class);
		product.printProductList();
	}
}
