package CoreJava;

public class ClassA008 
{
	void meth1(int a, int b)
	{
		ClassA008 obj1 = new ClassA008();
		System.out.println(a-1);
		System.out.println(b);
		obj1.meth4(10,2,2);
		}
	void meth2(int x)
	{
		ClassA008 obj2 = new ClassA008();
		System.out.println(x);
		obj2.meth1(10, 10);
		System.out.println(x+9);
	}
	void meth3(int x, int y)
	{
		System.out.println(x*y);
		ClassA008 obj =new ClassA008();
		System.out.println(y);
		obj.meth2(1);
	}
	void meth4(int a, int b, int c)
	{
		System.out.println(a+b);
		System.out.println(a/c);
		System.out.println(a-b);
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		ClassA008 obj = new ClassA008();
		obj.meth3(5, 2);
	}
}