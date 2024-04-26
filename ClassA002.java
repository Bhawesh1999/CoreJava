package CoreJava;

/**
 * @author bhparate
 *
 */
public class ClassA002 
{
	public void meth1() {
		System.out.println("meth1() called");
		System.out.println(99);
		ClassA002 obj2 = new ClassA002();
		System.out.println(1);
		obj2.meth2();
		System.out.println("99+1");
	}
	public void meth2() {
		System.out.println("meth2() called");
		System.out.println(100-99);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ClassA002 obj = new ClassA002();
		obj.meth1();
		System.out.println("java is awesome");
		System.out.println("End");
	}
}
