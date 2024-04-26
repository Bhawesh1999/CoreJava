package CoreJava;

public class ClassA042 
{
	int a; //0 default value
	static int b; //0 default value
	
	ClassA042()
	{
		a++;
		System.out.println("Instance variable:"+a);
		b++;
		System.out.println("Static variable "+b);
	}
	public static void main(String[] args) 
	{
		new ClassA042();
		System.out.println("------");
		new ClassA042();
		System.out.println("--------");
		new ClassA042();
		
	}

}
