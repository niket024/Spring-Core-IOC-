package com.nik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp
{
	private static AnnotationConfigApplicationContext ctx;

	public static void main(String[] args)
	{
		ctx = new AnnotationConfigApplicationContext(GenericConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		Student student = ctx.getBean(Student.class);
		System.out.println(student);
		ctx.registerShutdownHook();
	}
}