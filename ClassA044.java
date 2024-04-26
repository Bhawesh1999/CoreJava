package CoreJava;

public class ClassA044 
{
	final static int a;
	void meth1()
	{
		System.out.println("meth1 called");
	}
	static
	{
		a=50;
		System.out.println("staic block :"+a);
		new ClassA044().meth1();
		
	}
	public static void main(String[] args) 
	{
		System.out.println("main() method");
	}
	static
	{
		System.out.println("2nd static block "+a);
	}

}
