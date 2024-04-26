package CoreJava;

public class ClassA011 
{
	int meth1(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(a);
		return b*10;
		
	}
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println(new ClassA011().meth1(5, 2));
		System.out.println(new ClassA011().meth1(5, 2)+80);
		System.out.println("end");
	}

}
