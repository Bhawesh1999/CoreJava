package CoreJava;

public class ClassA054 
{
	void implicit()
	{
		byte b=10;
		System.out.println("byte value is "+b);
		short s=b;
		System.out.println("short value is"+s);
		s++;
		int i=s++;
		System.out.println("short value is "+s);
		s++;
		int i1=s++;
		System.out.println("int value is "+i1);
		System.out.println("short value is "+s);
		long l=i1;
		
		System.out.println("long value is"+(--l));
		float f=l;
		System.out.println("The value fo float is "+(f+b));
		double d=(--f);
		System.out.println("the value of double is "+d);
		show();
		if(!(d==f))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
	public static void main(String[] args) 
	{
		ClassA054 a = new ClassA054();
		a.implicit();
	}
	static void show()
	{
		char C='A';
		int a= ++C;
		System.out.println(a);
		ClassA054 obj = new ClassA054();
		String S = obj.meth1();
		System.out.println(S);
	}
	String meth1()
	{
		String S = "Implicit casting is done by the compiler automatically";
		return S;
	}

}
