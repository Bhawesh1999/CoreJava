package CoreJava;

public class ClassA034 
{
	void meth1()
	{
		System.out.println("Implementing operators");
		int a=10;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
	}
	void meth2()
	{
		System.out.println("meth2() called");
		int x= 100;
		System.out.println(x);
		System.out.println(x--);
		System.out.println(--x);
	}
	public static void main(String[] args) 
	{
		ClassA034 obj = new ClassA034();
		obj.meth1();
		obj.meth2();
		
	}

}
