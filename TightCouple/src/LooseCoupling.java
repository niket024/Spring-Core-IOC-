public class LooseCoupling
{
	static void common(Area a1)
	{
		a1.getArea();
	}

	public static void main(String[] args)
	{

		common(new Rectangle());
		common(new Polygon());
		common(new Circle());
	}
}
