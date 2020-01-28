package com.nik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GenericConfig
{
	@Bean(name = "h1")
	public HelloWorld helloWorld()
	{
		return new HelloWorld();
	}

	@Scope("singleton")
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Student getStudent()
	{
		return new Student();
	}
}

/**
 * The above code will be equivalent to the following XML configuration −
 * 
 * <beans> <bean id = "helloWorld" class = "com.nik.HelloWorld" /> </beans>
 **/
