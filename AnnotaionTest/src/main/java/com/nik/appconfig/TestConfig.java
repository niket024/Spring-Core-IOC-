package com.nik.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.nik.model.test.*;

@Configuration
public class TestConfig
{
	@Bean("a1")
	@DependsOn(value = { "b1", "c1" }) // Comments this line and monitor the order of bean creation
	public A getA()
	{
		return new A();
	}

	@Bean("b1")
	public B getB()
	{
		return new B();
	}

	@Bean("c1")
	public C getC()
	{
		return new C();
	}
}
