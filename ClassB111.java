package CoreJava;

public class ClassB111 extends ClassA111
{
	void meth1()
	{
		System.out.println("Classb meth1() called");
	}
	void meth2(int x, int y)
	{
		System.out.println("Substraction :"+(x-y));
	}
	public void meth3(String val, int a)
	{
		System.out.println("String value:"+val);
	}
	static void meth4()
	{
		System.out.println("Hellp");
	}
	  ClassB111 meth5() 
	  {
	        System.out.println("Tomorrow we are having a class");
	        return new ClassB111();
	    }

public static void main(String[] args) {
	ClassA111 obj1 = new ClassA111();
	obj1.meth1();
	obj1.meth2(100, 1);
	obj1.meth3("Java is awesome",100);
	obj1.meth4();
	obj1.meth5();
	System.out.println("------");
	ClassA111 obj2 = new ClassA111();
	obj2.meth1();
}
}
