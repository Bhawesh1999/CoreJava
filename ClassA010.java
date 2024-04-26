package CoreJava;

public class ClassA010 
{
	int meth1(int a, int b)
	{
		System.out.println("Hi");
		return a+b;
	}
	String meth2() {
		System.out.println("Hello");
		return "java is awesome";
	}
	public static void main(String[] args) 
	{
		int x = new ClassA010().meth1(99, 1)-1;
		System.out.println("x value: "+x);
		String data = new ClassA010().meth2();
		System.out.println(data);
	}
}
