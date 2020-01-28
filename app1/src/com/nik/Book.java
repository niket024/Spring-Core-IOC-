package com.nik;

public class Book extends Object
{
	private int id;
	private String name;
	private String author;
	private float price;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}
	
	
	@Override
	
	public String toString()
	{
		// TODO Auto-generated method stub
		return super.toString();
	}

}
