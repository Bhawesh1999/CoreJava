package CoreJava;

public class ClassA162 
{
	void meth1()
	{
		String s1 = "java";
		class InnerClass
		{
			void display()
			{
				String s2 = "is awesome";
				System.out.println(s1.concat(s2));
			}
			InnerClass()
			{
				System.out.println("Inner class constructor");
			}
		}
		new InnerClass().display();
	}
	
	public static void main(String[] args)
	{
		new ClassA162().meth1();
	}

}
