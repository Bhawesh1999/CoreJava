package CoreJava;

public class ClassA111 
{
	void meth1()
	{
		System.out.println("Class A meth() called");
	}
	void meth2(int a, int b)
	{
		System.out.println("Addition:"+a+b);
	}
	protected void meth3(String s, int x)
	{
		System.out.println("int value:"+x);
	}
	static void meth4()
	{
		System.out.println("Hi");
	}
	ClassA111 meth5()
	{
		System.out.println("today is saturday");
		return new ClassA111();
	}

}
