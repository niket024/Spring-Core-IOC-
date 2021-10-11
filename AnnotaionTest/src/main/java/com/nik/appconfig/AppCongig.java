package com.nik.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nik.model.User;

@Configuration
public class AppCongig
{

	// If we not give bean name then by default bean name will be method name
	@Bean("u1")
	@Scope("singleton")
	public User getUser()
	{
		return new User();
	}

}
