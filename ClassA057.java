package CoreJava;

public class ClassA057 
{
	void meth1(int a)
	{
		System.out.println("----meth1()-----");
		{
			System.out.println("hi");
		}
		System.out.println("meth1() completed");
	}
	void meth2(int a)
	{
		System.out.println("--------meth2()--------");
		if(a<10)
			//int x=50;
			System.out.println("hi");
		System.out.println("meth2() completed");
	}
	void meth3(int a)
	{
		System.out.println("--------meth3()------");
		if(false) {
			System.out.println("hi");
		}
		System.out.println("meth3() completed");
	}
	void meth4(int a)
	{
		System.out.println("-----------meth4()---------");
		if(a<=10)
		{
			System.out.println("hi");
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("hello");
			System.out.println("else block executed");
		}
		System.out.println("meth4() completed");
	}
	void meth5(int a)
	{
		System.out.println("-------meth5()--------");
		if(false)
		{
			System.out.println("hi");
		}
		else
			//int x=100;
			System.out.println("hello");
		System.out.println("meth5() completed");
	}
	int meth6(int a)
	{
		System.out.println("---------meth6()----");
		if(a==5)
			return a+5;
		return a-5;
	//	System.out.println("hello world");
		
	}
	void meth7(int a)
	{
		System.out.println("---------meth7()--------");
		if(a>0)
		{
			System.out.println(a+"is a positive no");
		}
		else if(a<0)
		{
			System.out.println(a+"is a negative no");
		}
		else
		{
			System.out.println(a+"is a equal to zero");
		}
	}
	public static void main(String[] args) 
	{
		ClassA057 obj = new ClassA057();
		obj.meth1(10);
		obj.meth2(100);
		obj.meth3(5);
		obj.meth4(50);
		obj.meth5(50);
		System.out.println(obj.meth6(5));
		obj.meth7(0);
		
		
		
	}

}
