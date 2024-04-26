package CoreJava;

public class ClassA005 
{
	void meth1() {
		System.out.println("meth1() called");
	}
	public static void main(String[] args) {
		System.out.println("start");
		new ClassA005().meth1();
		
		ClassA005 obj = new ClassA005();
		obj.meth1();
		System.out.println("End");
	}

}
