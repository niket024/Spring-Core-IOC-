package com.nik.jsr330;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CustomerService 
{
	@Inject
	CustomerDAO customerDAO;

	public void save() {
		
		System.out.println("CustomerService save method...");
		customerDAO.save();
		
	}
		
}