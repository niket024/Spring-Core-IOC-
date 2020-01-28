package com.nik;


public class Manager1
{
	public static void main(String[] args)
	{

		Person p1 = (Person) Util.getBean("p1");
		System.out.println("object ready");
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddress());
		Util.destroy("p1");
		System.out.println("done");
	}
}
