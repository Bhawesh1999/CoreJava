package CoreJava;

public class ClassB154 
{
	void display()
	{
		System.out.println("Implementing method reference");
		InterfaceA154 x = new ClassA154()::check;//Non-static method referencing
		InterfaceA154 x1 = ClassA154::msg;//static method reference
		InterfaceA154 x2 = ClassA154::new;//constructor reference
		
		x.meth1();
		x1.meth1();
		x2.meth1();
	}
	public static void main(String[] args) 
	{
		new ClassB154().display();
	}

}
