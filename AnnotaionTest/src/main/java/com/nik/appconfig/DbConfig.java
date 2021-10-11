package com.nik.appconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.nik.model.Categories;
import com.nik.model.Product;
import com.nik.model.Supplier;

@Configuration
public class DbConfig
{
	private static ApplicationContext applicationContext;

	@Bean("categories")
	public Categories getCategories()
	{
		System.out.println("Categories bean created");
		return new Categories();
	}

	@Bean("supplier")
	public Supplier getSupplier()
	{
		System.out.println("Supplier bean created");
		return new Supplier();
	}

	@Bean("product")
	@DependsOn(value = { "categories", "supplier" })
	public Product getProduct(Categories categories, Supplier supplier)
	{
		System.out.println("Product bean created");
		return new Product(categories, supplier);
	}

	public static void main(String[] args)
	{
		applicationContext = new AnnotationConfigApplicationContext(
				DbConfig.class);

		System.out.println(applicationContext.getBean(Product.class)
				.getCategories() == null ? "Null" : "Categories");
		
		System.out.println(applicationContext.getBean(Product.class)
				.getSupplier() == null ? "Null" : "Supplier");
	}
}
