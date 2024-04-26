package CoreJava;

public class ClassA079 
{

	ClassA079 meth1()
	{
		System.out.println("meth1() called");
		return this;
	}
	ClassA079 meth2()
	{
		System.out.println("meth2() called");
		return this;
	}
	ClassA079 meth3()
	{
		System.out.println("meth3() called");
		return this;
	}
	int meth4()
	{
		System.out.println("meth4() called");
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println(new ClassA079().meth1().meth2().meth3().meth4()+1);
	}
}
