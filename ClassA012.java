package CoreJava;

public class ClassA012 
{
	int meth1(int a)
	{
		System.out.println(a+a);
		return a+10;
	}
	int meth2(int a, int b)
	{
		System.out.println(a);
		return a+b+10;
	}
	int meth3(int a, int b, int c)
	{
		System.out.println(c);
		return a+b+c+10;
	}
	public static void main(String[] args) 
	{
		ClassA012 obj = new ClassA012();
		int x = obj.meth1(5);
		System.out.println(x+10);
		System.out.println(obj.meth2(8, 2));
		int y = obj.meth3(2, 3, 4);
		System.out.println(x+y);
		
	}

}
