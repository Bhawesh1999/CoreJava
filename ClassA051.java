package CoreJava;

public class ClassA051 
{
	static int a=0;
	int b=0;
	
	ClassA051()
	{
		a++;
		b++;
		System.out.println("static variable ==>"+a);
		System.out.println("Instance variable ==>"+b);
		System.out.println("---");
	}
	void display()
	{
		System.out.println("Ascessing static variable");
		System.out.println(ClassA051.a);
		System.out.println(a);
		System.out.println(new ClassA051().a);
	}
	public static void main(String[] args) 
	{
		new ClassA051();
		new ClassA051();
		new ClassA051();
		System.out.println("-----------");
		new ClassA051().display();
		
	}

}
