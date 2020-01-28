package com.nik;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareTest implements ApplicationContextAware,
		BeanNameAware
{
	@Autowired
	static ApplicationContext context;

	public static ApplicationContext getContext()
	{
		return context;
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException
	{
		ApplicationContextAwareTest.context = context;

	}

	@Override
	public void setBeanName(String beanName)
	{
		System.out.println("Bean name is: " + beanName);

	}
}