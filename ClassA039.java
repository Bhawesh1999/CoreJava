package CoreJava;

public class ClassA039 
{
	void meth1(int a, int b, int c)
	{
		System.out.println("Addition"+(a+b+c));
		new ClassA039().meth2(100,99);
	}
	void meth2(int x, int y)
	{
		System.out.println("Substraction:"+(x-y));
	}
	ClassA039()
	{
		System.out.println("Division:"+(10/2));
	}
	ClassA039(int x)
	{
		System.out.println("Multiplication :"+(x+x));
	}
	public static void main(String[] args) 
	{
		new ClassA039(10).meth1(5, 5, 5);
	}

}
