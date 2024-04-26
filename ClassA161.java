package CoreJava;

public class ClassA161 
{
	int a =10;
	static int b=20;
	
	void meth1()
	{
		System.out.println("Normal method of outer class");
		System.out.println(a);
		System.out.println(b);
		System.out.println("====");
	}
	static void meth2()
	{
		System.out.println("static meth of outer class");
		System.out.println(new ClassA161().a);
		System.out.println(b);
		System.out.println("-------");
	}
	ClassA161(){
		System.out.println("outer class default constructor");
	}
	static
	{
		System.out.println("outer class static block");
	}
	static class InnerClass
	{
		void display()
		{
			System.out.println(new ClassA161().a);
			System.out.println(b);
		}
		InnerClass()
		{
			System.out.println("Inner class constructor");
			new ClassA161().meth1();
			meth2();
		}
		static
		{
			System.out.println("inner class static block");
		}
		public static void main(String[] args) 
		{
			new InnerClass().display();
		}
	}
	public static void main(String[] args) 
	{
		ClassA161.InnerClass obj = new ClassA161.InnerClass();
		obj.display();
	}

}
