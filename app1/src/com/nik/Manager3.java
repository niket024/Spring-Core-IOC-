package com.nik;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager3
{
public static void main(String[] args)
{
	ClassPathResource cpr=new ClassPathResource("config.xml");
	BeanFactory factory=new XmlBeanFactory(cpr);
	Book b1=(Book)factory.getBean("b1");
	System.out.println(b1.getId());
	System.out.println(b1.getName());
	System.out.println(b1.getAuthor());
	System.out.println(b1.getPrice());
	System.out.println("done");
}
}
