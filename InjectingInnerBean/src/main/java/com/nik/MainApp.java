package com.nik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("config.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();

	}
}