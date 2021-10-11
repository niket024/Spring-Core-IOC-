package com.nik;

public class Bus implements Medium
{
	public void goByBUs()
	{
		System.out.println("Travelling by Bus");
	}

	@Override
	public void travel(Medium medium)
	{
		System.out.println("Travelling by Bus");

	}
}
