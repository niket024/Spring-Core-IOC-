package morningbatch.morningbatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Config.class);
		Greeting greeting = applicationContext.getBean("getGreeting",
				Greeting.class);
		System.out.println(greeting.getGreeting());
	}

}
