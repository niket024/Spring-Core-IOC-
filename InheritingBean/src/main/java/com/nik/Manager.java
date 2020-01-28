package com.nik;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("config.xml");

    	Customer cust = (Customer)context.getBean("BaseCustomerIndia");
    	System.out.println(cust);
    	
    }
}