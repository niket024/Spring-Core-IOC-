package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.OtherConfig;
import com.nik.model.Ecommerce;

public class Manager3
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext(OtherConfig.class);
		System.out
				.println(context.getBean(Ecommerce.class).getCategories() == null ? "NUll"
						: "Categories");
		System.out
				.println(context.getBean(Ecommerce.class).getSupplier() == null ? "NUll"
						: "Supplier");
		System.out
				.println(context.getBean(Ecommerce.class).getProduct() == null ? "NUll"
						: "Product");

	}
}
