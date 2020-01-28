package com.nik.model;

public class Ecommerce
{
	private Product product;
	private Supplier supplier;
	private Categories categories;

	public Ecommerce(Product product, Supplier supplier, Categories categories)
	{
		super();
		this.product = product;
		this.supplier = supplier;
		this.categories = categories;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

	public Supplier getSupplier()
	{
		return supplier;
	}

	public void setSupplier(Supplier supplier)
	{
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

}
