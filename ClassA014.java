package CoreJava;

public class ClassA014 
{
	int meth1(char C) {
		System.out.println("meth1() called");
		System.out.println("C value :"+C);
		return new ClassA014().meth2("java is awesome");
	}
	int meth2(String S)
	{
		System.out.println("meth2() called");
		System.out.println("S value: "+S);
		return 100;
	}
	public static void main(String[] args) {
		int result = new ClassA014().meth1('A');
		System.out.println(result-99);
	}

}
