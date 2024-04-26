package CoreJava;

public class ClassA009 
{
	int meth1() {
		System.out.println("meth1() called");
		return 99;
	}
	void meth2() {
		System.out.println("meth2() called");
	}
	public static void main(String[] args) {
		ClassA009 obj = new ClassA009();
		int result = obj.meth1();
		System.out.println("result value : "+result);
		obj.meth2();
	}

}
