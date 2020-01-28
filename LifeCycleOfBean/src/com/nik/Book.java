package com.nik;


public class Book 
{
	private String title;
	private String author;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		System.out.println("setTitle");
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		System.out.println("setAuthor");
		this.author = author;
	}

	public void init()
	{
		System.out.println("init");
	}
	
	public void destroy()
	{
		System.out.println("destroy");
	}

}
