package CoreJava;

public abstract class ClassA112 
{
	public abstract void meth1();
	
	abstract void meth1(String S);
	
	void meth2()
	{
		System.out.println("meth2() called");
	}
	static void meth3()
	{
		System.out.println("static meth3() called");
	}
	ClassA112()
	{
		System.out.println("Abstract class constructor called");
	}
	public static void main(String[] args) {
		System.out.println("ClassA main() called");
		//new ClassA();
		ClassA112.meth3();
	}

}
