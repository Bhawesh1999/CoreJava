package CoreJava;

public class ClassA004 
{
	void meth1() {
		ClassA004 obj1 = new ClassA004();
		obj1.meth5();
		int a =10;
		System.out.println(10);
		System.out.println(54+a);
	}
	void meth2() {
		int a =20;
		System.out.println(78-a);
	}
	void meth3() {
		int a =30;
		ClassA004 obj1 = new ClassA004();
		System.out.println(89+1);
		obj1.meth1();
		System.out.println(10);
	}
	void meth4()
	{
		int a=10;
		System.out.println(89);
		System.out.println(85);
		System.out.println(44);
	}
	void meth5() {
		System.out.println(77);
		ClassA004 obj1 = new ClassA004();
		obj1.meth2();
		System.out.println(99);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ClassA004 obj = new ClassA004();
		obj.meth3();
		System.out.println("End");
	}
}
