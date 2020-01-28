package com.nik;

public class Manager2
{
public static void main(String[] args)
{
	B b1=(B)Util.getBean("b1");
	System.out.println(b1);
	B b2=(B)Util.getBean("b2");
	System.out.println(b2);
}
}
