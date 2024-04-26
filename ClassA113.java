package CoreJava;

public class ClassA113 extends ClassB113 implements InterfaceA113,InterfaceB113
{
	public void meth1()
	{
		System.out.println("Interface A abstract method overriden");
	}
	public void show()
	{
		System.out.println("Interfae B abstract method overrdied");
	}
	public static void main(String[] args) {
		InterfaceA113 obj = new ClassA113();
		obj.meth1();
		obj.meth2();
		//obj.meth4();
		
		System.out.println("-----------");
		InterfaceB113 obj1 = new ClassA113();
		obj1.show();
		
		new ClassA113().display();
		
	}

}
