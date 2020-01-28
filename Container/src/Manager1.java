import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class Manager1
{
public static void main(String[] args)
{
	ClassPathResource cpr=new  ClassPathResource("config.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
	Person p1=(Person)bf.getBean("p1");
	System.out.println(p1.getId());
	System.out.println(p1.getName());
}
}
;