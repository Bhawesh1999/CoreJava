package CoreJava;

public class ClassA132 
{
	void meth1()
	{
		System.out.println("meth1() called");
		//ClassA132 obj = new ClassA132();
	}
	@Override
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args) {
		ClassA132 obj1 = new ClassA132();
		ClassA132 obj2 = new ClassA132();
		
		System.out.println("obj1 :"+obj1.hashCode());
		System.out.println("obj2 :"+obj2.hashCode());
		
		obj1.meth1();
		System.out.println("----");
		
		//obj2.obj1;
		//obj1.null;
		
		System.out.println("obj1 :"+obj1.hashCode());
		System.out.println("obj2 :"+obj2.hashCode());
		
		System.gc();
	}

}
