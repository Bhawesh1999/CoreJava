package CoreJava;

public class ClassA049 
{
	static int x=10;
	public static void main(String[] args) 
	{
		ClassA049 t1 = new ClassA049();
		ClassA049 t2 = new ClassA049();
		
		t1.x=20;
		System.out.println(x+" ");
		System.out.println(t2.x);
		
	}

}
