package com.nik;

public class Manager2
{
	public static void main(String[] args)
	{
		Book b1 = (Book) Util.getBean("b1");
		System.out.println("object ready");
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		Util.destroy("b1");
		System.out.println("done");
	}
}
