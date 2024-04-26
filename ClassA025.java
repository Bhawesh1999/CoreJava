package CoreJava;

public class ClassA025 
{
	void meth1()
	{
		System.out.println("meth1() called");
	}
	static void meth2()
	{
		System.out.println("meth2() called");
	}
	public static void main(String[] args) 
	{
		new ClassA025().meth1();
		//ClassA025.meth1();
		new ClassA025().meth2();
		ClassA025.meth2();
	}

}
