package com.nik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Employee
{
	private int id;
	private String fname;
	private String lname;
	private double weight;
	private int salary;
	private String[] mail;
	private ArrayList<String> lovers;
	private HashSet<String> mobileno;
	private HashMap<String, String> education;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String[] getMail()
	{
		return mail;
	}

	public void setMail(String[] mail)
	{
		this.mail = mail;
	}

	public ArrayList<String> getLovers()
	{
		return lovers;
	}

	public void setLovers(ArrayList<String> lovers)
	{
		this.lovers = lovers;
	}

	public HashSet<String> getMobileno()
	{
		return mobileno;
	}

	public void setMobileno(HashSet<String> mobileno)
	{
		this.mobileno = mobileno;
	}

	public HashMap<String, String> getEducation()
	{
		return education;
	}

	public void setEducation(HashMap<String, String> education)
	{
		this.education = education;
	}

}
