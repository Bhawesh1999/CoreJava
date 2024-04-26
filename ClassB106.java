package CoreJava;

public class ClassB106 extends ClassA106
{
	void meth2()
	{
		System.out.println("Class B method");
	}
	public static void main(String[] args) 
	{
		ClassA106 obj1 = new ClassA106();
		obj1.meth1();
		//obj.meth2();
		
		ClassA106 obj2 = new ClassA106();
		obj2.meth1();
		//obj2.meth2();
		
		ClassB106 obj = new ClassB106();
		obj.meth1();
		obj.meth2();
		
		//ClassB106 obj2 = new ClassA106();//C.E.
		
		}
}
