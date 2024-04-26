package CoreJava;

public class ClassB112 extends ClassA112
{
	public void meth1()
	{
		System.out.println("abstract method overriden");
	}
	void meth1(String data)
	{
		System.out.println(data);
	}
	public static void main(String[] args) {
		ClassA112 obj = new ClassB112();
		obj.meth1();
		obj.meth2();
		obj.meth1("java is awesome");
	}

}
