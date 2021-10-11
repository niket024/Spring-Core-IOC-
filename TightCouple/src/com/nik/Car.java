package com.nik;

public class Car implements Medium
{
	public void goByCar()
	{
		System.out.println("Travelling by car");
	}
	
	@Override
	public void travel(Medium medium)
	{
		System.out.println("Travelling by car");
		
	}
}
