package CoreJava;

public class ClassA023 
{
	void display()
	{
		System.out.println("Hello world");
	}
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args) {
		ClassA023 obj1 = new ClassA023();
		ClassA023 obj2 = new ClassA023();
		
		obj1.display();
		
		obj1=null;
		
		obj2.display();
		
		System.gc();
	}

}
