package CoreJava;

public class ClassA078 
{
	void meth1()
	{
		System.out.println("meth1() called");
		this.meth2(99,1);
	}
	void meth2(int a, int b)
	{
		System.out.println("meth2() called :"+(a+b));
		System.out.println(meth3());
	}
	String meth3()
	{
		System.out.println("meth3() called");
		return "java is awesome";
	}
	public static void main(String[] args) 
	{
		new ClassA078().meth1();
//this.meth1();//C.E. because we can not use this keyword in static area
		
	}

}
