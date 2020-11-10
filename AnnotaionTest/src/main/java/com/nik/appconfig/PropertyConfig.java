package com.nik.appconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nik.model.User;

@Configuration
@PropertySource("classpath:/application.properties")
public class PropertyConfig
{
	@Value("${user.id}")
	private Integer id;

	@Value("${greetings}")
	private String greetings;
	@Value("${spring.hello}")
	private String helloMsg;
	// System level env variables
	@Value("${BANNER_APP_CONFIG}")
	private String systemVariables;

	@Bean("hello")

	public String getGreetings()
	{
		if (greetings.contains("$"))
			throw new RuntimeException();
		return greetings;
	}

	@Bean("helloAgain")
	public String getHello()
	{
		return greetings;
	}

	@Bean("user")
	public User getUser()
	{
		return new User(id);
	}

}
