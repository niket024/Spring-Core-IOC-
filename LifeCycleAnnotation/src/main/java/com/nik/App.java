package com.nik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App
{
	@Bean("p1")
	public Person getPerson()
	{
		return new Person();
	}

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				App.class);
		Person p1 = ctx.getBean(Person.class);
		ctx.close();
	}
}
