package com.nik;

public class Journey
{
	public void startJourney()
	{
		//tight coupling
		Bike bike = new Bike();
		bike.goByBike();
	}
	public void startJourney(Medium medium)
	{
		medium.travel(medium);
	}
}
