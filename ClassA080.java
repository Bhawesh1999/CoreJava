package CoreJava;

public class ClassA080 
{
	void meth1()
	{
		//this("hello world"); C.E. Because we need to user this() only inside a constructor
		System.out.println("meth1() called");
	}
	ClassA080()
	{
		this("java is awesome");
		this.meth1();
		System.out.println("default constructor");
		new ClassA080("java is awesome");//C.E. because it should be 1st statement
	}
	ClassA080(String S)
	{
		System.out.println(S);
	}
	public static void main(String[] args) {
		new ClassA080();
	}

}
