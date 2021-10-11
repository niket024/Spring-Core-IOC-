package morningbatch.morningbatch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
	@Bean
	public Greeting getGreeting()
	{
		return new Greeting();
	}
}
