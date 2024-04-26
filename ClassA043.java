package CoreJava;

public class ClassA043 
{
	int x=100;
	static int y = 200;
	void meth1()
	{
		System.out.println("instance variable :"+x);
		System.out.println("static variable "+y);
	}
	static void meth2()
	{
		System.out.println("Instance variable :"+new ClassA043().x);
		System.out.println("static variable"+y);
	}
	public static void main(String[] args) 
	{
		ClassA043 obj = new ClassA043();
		obj.meth1();
		System.out.println("------");
		meth2();
		obj.meth2();
		ClassA043.meth2();
		
	}

}
