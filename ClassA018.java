package CoreJava;

public class ClassA018 
{
	int meth1(int a , int b) {
		System.out.println(a);
		System.out.println(a-b);
		return new ClassA018().meth4(a-1, "Hi");
	}
	String meth2(int x) {
		System.out.println(x - new ClassA018().meth1(200,199));
		System.out.println(x);
		return "Java";
	}
	String meth3(int a, int b, String S)
	{
		System.out.println(a);
		System.out.println(a+a);
		System.out.println(a+b);
		return S;
	}
	int meth4(int a, String S)
	{
		System.out.println(a);
		System.out.println(S);
		return a+a;
	}
	String meth5(String S)
	{
		return S;
	}
	public static void main(String[] args) {
		System.out.println(new ClassA018().meth5(new ClassA018().meth3(15, 25,new ClassA018().meth2(500))));
	}
}
