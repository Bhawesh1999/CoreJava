package CoreJava;

public class ClassA013 
{
	void meth1()
	{
		System.out.println(10);
		System.out.println(64);
		System.out.println("end");
	}
	int meth2(int a, int b, int c)

	{
		System.out.println(a);
		ClassA013  obj = new ClassA013();
		String s = obj.meth5(100,"java is awesome");
		System.out.println(s);
		return a-b;
	}
	String meth3(String s, int b, int d)
	{
		System.out.println(b+d);
		return s;
	}
	int meth4(int c, int k)
	{
		System.out.println(k);
		ClassA013 obj = new ClassA013();
		int result = obj.meth2(50, 50, 50);
		System.out.println(result);
		return k+10;
	}
	String meth5(int a, String L)
	{
		System.out.println(a+a);
		ClassA013 obj = new ClassA013();
		String s = obj.meth3("hi", 15, 10);
		System.out.println(5);
		return L;
	}
	public static void main(String[] args) {
		ClassA013 obj = new ClassA013();
		System.out.println("start");
		int result = obj.meth4(20,10);
		System.out.println(result);
		obj.meth1();
	}
}
