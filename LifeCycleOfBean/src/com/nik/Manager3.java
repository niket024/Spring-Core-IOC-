package com.nik;

import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager3
{
	public static void main(String[] args)
	{
		AbstractBeanFactory abf = new XmlBeanFactory(new ClassPathResource(
				"config.xml"));
		Person p1 = (Person) abf.getBean("p1");
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddress());
		abf.destroySingletons();
	}
}
