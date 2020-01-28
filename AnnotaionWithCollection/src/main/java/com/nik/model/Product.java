package com.nik.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Product
{
	@Autowired
	private List<String> productList;

	public Product()
	{
		
	}

	public Product(List<String> productList)
	{
		this.productList = productList;
	}

	public void printProductList()
	{
		System.out.println(productList);
	}
}
