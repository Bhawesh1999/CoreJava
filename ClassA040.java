package CoreJava;

public class ClassA040 
{
	void meth1()
	{
		int a=10;
		if(a>100)
		{
			System.out.println("hi");
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("hello");
			System.out.println("else block executed");
		}
	}
	void person(int age)
	{
		if(age>=18)
		{
			System.out.println("person is eligible");
		}
		else
		{
			System.out.println("person is not eligible to vote");
		}
	
	}
	public static void main(String[] args) 
	{
		new ClassA040().person(19);
		new ClassA040().meth1();
	}

}
