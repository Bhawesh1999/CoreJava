package CoreJava;

public class ClassA035 
{
	void meth1()
	{
		int x=100;
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(++x);
		x++;
		System.out.println(++x);
		x--;
		System.out.println(--x);
		System.out.println(x);
		System.out.println(x++);
		System.out.println(--x);
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		new ClassA035().meth1();
	}

}
