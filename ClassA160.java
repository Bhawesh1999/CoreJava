package CoreJava;

public class ClassA160 
{
	private void meth1()
	{
		System.out.println("Outer class private method");
	}
	ClassA160()
	{
		System.out.println("Outer class constructor");
	}
	public class InnerClass
	{
		void display()
		{
			System.out.println("Inner class display() mehtod");
			meth1();
		}
		InnerClass()
		{
			System.out.println("InnerClass Constructor");
		}
	}
	public static void main(String[] args) {
		ClassA160.InnerClass obj = new ClassA160().new InnerClass();
		obj.display();
	}
	

}
