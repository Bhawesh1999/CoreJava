package CoreJava;

public class ClassA114 implements InterfaceA114, InterfaceB114
{
	public void msg()
	{
		InterfaceA114.super.msg();
		InterfaceB114.super.msg();
	}
	public static void main(String[] args) {
		InterfaceA114 obj = new ClassA114();
		obj.msg();
	}

}
