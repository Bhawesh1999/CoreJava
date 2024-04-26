package CoreJava;

public class ClassA050 
{
	static int x= m1();
	public static void main(String[] args) 
	{
		System.out.println(ClassA050.x);
	}
	static
	{
		System.out.println(x);
		ClassA050.x = x+20;
	}
	static int m1()
	{
		ClassA050.x =50;
		return m2();
	}
	static int m2()
	{
		System.out.println(ClassA050.x);
		return 100;
	}

}
