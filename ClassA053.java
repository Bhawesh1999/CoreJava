package CoreJava;

public class ClassA053 
{
	void implicit()
	{
		System.out.println("Performing implicit type casting");
		byte b=50;
		int i = b;
		
		System.out.println("byte value: "+b);
		System.out.println("int value: "+i);
		System.out.println("------");
		
		char c='A';
		int y = c;
		
		System.out.println("char value :"+c);
		System.out.println("inte value :"+y);
		System.out.println("    ");
		
		short s =500;
		double d =s;
		System.out.println("short value :"+s);
		System.out.println("double value :"+d);
		
	System.out.println("      ");
	}
	void explicit()
	{
		System.out.println("performing explicit type casting");
		int y =100;
		byte b1 = (byte)y;
		System.out.println("int value :"+y);
		System.out.println("byte value :"+b1);
		System.out.println("    ");
		
		int x=500;
		byte b2 = (byte)x;
		System.out.println("int value:"+y);
		System.out.println("byte value:"+b2);
		System.out.println();
		
		float d =100.0f;
		byte b3 = (byte)d;
		System.out.println("int value :"+y);
		System.out.println("byte value :"+b3);
		System.out.println();
		
		
	}
	public static void main(String[] args) 
	{
		ClassA053 obj = new ClassA053();
		obj.implicit();
		System.out.println("------");
		obj.explicit();
		
	}

}
