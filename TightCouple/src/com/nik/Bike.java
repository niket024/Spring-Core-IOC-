package com.nik;

public class Bike implements Medium
{
	public void goByBike()
	{
		System.out.println("Travelling by bike");
	}
	
	@Override
	public void travel(Medium medium)
	{
		System.out.println("Travelling by bike");
		
	}
}
