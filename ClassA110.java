package CoreJava;

public class ClassA110
{
	private void meth1()
	{
		System.out.println(10);
	}
	final static int meth1(int a)
	{
		System.out.println(20);
		return a;
	}
	protected void meth1(int a, String b)
	{
		System.out.println(30);
	}
	final static String meth1(String S, int a)
	{
		System.out.println(40);
		return S;
	}
	public void meth1(StringBuffer sb)
	{
		System.out.println(50);
	}
	ClassA110 meth1(String S)
	{
		System.out.println(60);
		return this;
	}
	static private void meth1(byte b)
	{
		System.out.println(70);
	}
	public final static void main(String[] args) {
		ClassA110 obj = new ClassA110();
		obj.meth1();
		obj.meth1(100);
		obj.meth1(100,"Java");
		obj.meth1("Java",100);
		obj.meth1(new StringBuffer("java"));
		obj.meth1("java");
		obj.meth1((byte)100);
		System.out.println("-------");
		ClassA110.main();
		ClassA110.main("Java is awesome");
	}
	public static void main()
	{
		System.out.println("1st main() ");
	}
	public static void main(String S)
	{
		System.out.println("2nd main()");
	}
	ClassA110()
	{
		this("paramterized constrcutor");
		System.out.println("Default constructor of Class");
	}
	ClassA110(String S)
	{
		System.out.println(S.concat("called").toUpperCase());
	}

}
