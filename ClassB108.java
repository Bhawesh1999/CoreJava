package CoreJava;

public class ClassB108 extends CLassA108
{
	void meth2()
	{
		System.out.println("Class B method");
		super.meth1();
	}
	void meth3()
	{
		System.out.println("Hello");
	}
	ClassB108()
	{
		System.out.println("Class B default constrcutor");
		super.meth1();
		this.meth3();
	}
	ClassB108(String data)
	{
		super("java is awesome");
		System.out.println("Class B parameterized constructor:"+data);
	}
	public static void main(String[] args) 
	{
		ClassB108 obj = new ClassB108("Hi");
		obj.meth2();
		//super.meth1();C.E> vecause we cant user "super" inside static area
		//this.meth3();C.E. because we can not user"this" inside static area
	}

}
