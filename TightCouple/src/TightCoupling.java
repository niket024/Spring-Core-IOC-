import java.util.Scanner;

public class TightCoupling
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the entity");
		String entity=sc.next();
		if(entity.equals("circle"))
		{
			Circle c1=new Circle();
			c1.getArea();
		}
		else if(entity.equals("square"))
		{
			Square s1=new Square();
			s1.getArea();
		}
		else if(entity.equals("rect"))
		{
			Rectangle r1 = new Rectangle();
			r1.getArea();
		}
		else if(entity.equals("pogon"))
		{
			Polygon p1 = new Polygon();
			p1.getArea();
		}
		
		sc.close();
	}
}
