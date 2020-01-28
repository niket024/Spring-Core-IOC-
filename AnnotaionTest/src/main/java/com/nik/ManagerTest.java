package com.nik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nik.appconfig.TestConfig;
import com.nik.model.test.A;

public class ManagerTest
{
	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext(TestConfig.class);
		A a1 = context.getBean(A.class);
		a1.doSomething();
	}
}
