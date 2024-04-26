package CoreJava;

public class ClassA006 
{
	void meth1(int a)
	{
		System.out.println("Hi");
		System.out.println(a);
		System.out.println("a");
		System.out.println(a-99);
	}
	void meth2(int x, String s)
	{
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(x*2);
	}
	public static void main(String[] args) {
		ClassA006 obj = new ClassA006();
		obj.meth1(100);
		System.out.println("-----");
		obj.meth2(500, "Java is awesome");
	}

}
