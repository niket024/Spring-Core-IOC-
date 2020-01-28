package com.nik.appconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.nik.model.Categories;
import com.nik.model.Ecommerce;
import com.nik.model.Product;
import com.nik.model.Supplier;

@Configuration
@Import(DbConfig.class)
public class OtherConfig
{
	@Autowired
	private Product product;
	@Autowired
	private Supplier supplier;
	@Autowired
	private Categories categories;

	@Bean("eCommerce")
	public Ecommerce getEcommerce()
	{
		return new Ecommerce(product, supplier, categories);
	}
}
