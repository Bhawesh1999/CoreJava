package CoreJava;

public class ClassA001 
{
	public void meth1() {
		int i =10;
		System.out.println("Hi");
	}
	public void meth2() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		System.out.println("java is awesome");
		ClassA001 obj = new ClassA001();
		obj.meth1();
		System.out.println("----");
		obj.meth2();
	}

}
