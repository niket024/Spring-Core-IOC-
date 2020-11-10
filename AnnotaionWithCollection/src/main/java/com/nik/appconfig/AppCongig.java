package com.nik.appconfig;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nik.model.Product;
import com.nik.model.Product1;

@Configuration
public class AppCongig
{

	// If we not give bean name then by default bean name will be method name
	@Bean
	public Product getProduct()
	{
		return new Product();
	}
	
	@Bean("p1")
	public Product1 getProductInstance()
	{
		return new Product1(Arrays.asList("Stationary", "Groceries", "Health"));
	}

	@Bean
	public List<String> productList()
	{
		return Arrays.asList("Book", "Cloths", "Toys");
	}

}
