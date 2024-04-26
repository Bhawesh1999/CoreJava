package CoreJava;

public class ClassA045 
{
	static int a = ClassA045.meth1();
	
	static int meth1() {
		System.out.println("meth1() called");
		return 100;
	}
	static {
		System.out.println("1st static block :"+a);
		a=50;
	}
	public static void main(String[] args) {
		System.out.println("java is awesome :"+a);
	}
	static
	{
		System.out.println("2nd static vlock :"+a);
		a=25;
	}
}
