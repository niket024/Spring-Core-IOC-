package com;

import com.nik.*;
import com.nik.Journey;

public class Manager
{
	public static void main(String[] args)
	{
		//Loose coupling
		new Journey(new Car()).startJourney();
	}
}
