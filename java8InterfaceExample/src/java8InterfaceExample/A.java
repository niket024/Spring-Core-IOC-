package java8InterfaceExample;

public interface A
{
	default void test()
	{
		System.out.println("default");
	}
	static void test1()
	{
		System.out.println("static");
	}
}
