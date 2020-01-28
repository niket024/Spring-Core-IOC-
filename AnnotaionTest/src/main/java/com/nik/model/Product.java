package com.nik.model;

public class Product
{

	private Categories categories;
	private Supplier supplier;

	public Product(Categories categories, Supplier supplier)
	{
		super();
		this.categories = categories;
		this.supplier = supplier;
	}

	public Categories getCategories()
	{
		return categories;
	}

	public void setCategories(Categories categories)
	{
		this.categories = categories;
	}

	public Supplier getSupplier()
	{
		return supplier;
	}

	public void setSupplier(Supplier supplier)
	{
		this.supplier = supplier;
	}

}
