package CoreJava;

public class ClassA003 
{
	 void meth1()
	{
		ClassA003 obj = new ClassA003();
		obj.meth2();
		int a =10;
		System.out.println("Hi");
		System.out.println(a+90);
	}
	void meth2() {
		int x=100;
		System.out.println("Hello");
		System.out.println(x-99);
	}
	public static void main(String[] args) {
		System.out.println("java is awesome");
		ClassA003 obj = new ClassA003();
		obj.meth1();
		
	}

}
