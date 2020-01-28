package com.nik.model;

import java.util.List;

public class Product1
{

	private List<String> productList;

	public Product1(List<String> productList)
	{
		this.productList = productList;
	}

	public void printProductList()
	{
		System.out.println(productList);
	}
}
