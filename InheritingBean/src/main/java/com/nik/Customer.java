package com.nik;

public class Customer
{

	private int type;
	private String action;
	private String Country;
	private String State;

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public String getCountry()
	{
		return Country;
	}

	public void setCountry(String country)
	{
		Country = country;
	}

	public void setState(String state)
	{
		State = state;
	}

	public String getState()
	{
		return State;
	}

	@Override
	public String toString()
	{
		return "Customer [type=" + type + ", action=" + action + ", Country="
				+ Country + ", State=" + State + "]";
	}


	

}
