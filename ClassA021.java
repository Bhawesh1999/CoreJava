package CoreJava;

public class ClassA021 
{
	void meth1()
	{
		System.out.println("Hi, I am from meth1()");
		ClassA021 obj1= new ClassA021();
		ClassA021 obj2 = new ClassA021();
		
		System.out.println("obj1 hashcode is :"+obj1.hashCode());
		System.out.println("obj2 hashcode is :"+obj2.hashCode());
	}
	public static void main(String[] args) 
	{
		new ClassA021().meth1();
	}
}
