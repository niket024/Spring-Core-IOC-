import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Manager1
{
public static void main(String[] args)
{
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Person p1=(Person)context.getBean("p1");
	System.out.println(p1.getId());
	System.out.println(p1.getName());
}
}
;