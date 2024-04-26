package CoreJava;

public class ClassA015 
{
	int meth1(int a )
	{
		System.out.println(a);
		ClassA015 obj = new ClassA015();
		return obj.meth2()+obj.meth3()+a;
	}
	int meth2() {
		System.out.println("Hi");
		return 2*new ClassA015().meth3();
	}
	int meth3() {
		System.out.println("Hello");
		return 5;
	}
	public static void main(String[] args) {
		System.out.println(new ClassA015().meth1(5)+5);
	}

}
