package CoreJava;

public class ClassA017 
{
	String meth1(int a, int b)
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value= new ClassA017().meth5();
		System.out.println(value);
		return "java";
	}
	int meth2(int a)
	{
		System.out.println(75);
		int b = 5;
		System.out.println(b-a);
		return(5*5)-b;
	}
	void meth3()
	{
		System.out.println("start");
		System.out.println(new ClassA017().meth4());
		System.out.println(40);
	}
	String meth4()
	{
		System.out.println("today is tuesday");
		return new ClassA017().meth1(4, 8);
	}
	int meth5()
	{
		ClassA017 obj = new ClassA017();
		System.out.println(99);
		return obj.meth2(5);
	}
	public static void main(String[] args) {
		ClassA017 obj = new ClassA017();
		obj.meth3();
	}

}
