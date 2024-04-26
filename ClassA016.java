package CoreJava;

public class ClassA016 
{
	int meth1(int a, int b, char c)
	{
		System.out.println(c);
		int result = new ClassA016().meth2("java",100,'Y');
		return 10+a+result;
	}
	int meth2(String S, int a, char C)
	{
		System.out.println(S);
		System.out.println(C);
		return 20;
	}
	public static void main(String[] args) {
		System.out.println(new ClassA016().meth1(10, 20, 'X'));
	}

}
