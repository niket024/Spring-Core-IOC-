package com.nik;

public class Journey
{
	Travel travel;

	public Journey(Travel travel)
	{
		super();
		this.travel = travel;
	}

	public void startJourney()
	{
		travel.go();
	}
}
