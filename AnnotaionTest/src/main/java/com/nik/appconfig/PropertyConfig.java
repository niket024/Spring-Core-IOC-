package com.nik.appconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
public class PropertyConfig
{
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
		return greetings;
	}

	@Bean("helloAgain")
	public String getHello()
	{
		return greetings;
	}

}
