package com.nik;

public class Manager1
{
	public static void main(String[] args)
	{
		Person p1 = (Person) Util.getBean("p1");
		System.out.println(p1.getId());
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
		System.out.println(p1.getAddress().getCity());
		System.out.println(p1.getAddress().getState());
		Address a1 = (Address) Util.getBean("address1");
		System.out.println(a1.getPerson().getFname());
		System.out.println("done");

	}
}
