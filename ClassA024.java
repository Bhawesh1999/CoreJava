package CoreJava;

public class ClassA024 
{
	void meth1() {
		System.out.println("meth1() called");
		System.out.println(10+10);
		System.out.println("Hi");
	}
	int meth2(String S) {
		System.out.println("Meth2() called");
		System.out.println("s value: "+S);
		return 100;
	}
	int meth3(int a, int b)
	{
		System.out.println("meth3() called");
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
		System.out.println("Additiona :"+(a+b));
		System.out.println("int and char both are compatible datatypes");
		return 'A';
	}
	int meth4() {
		System.out.println("meth4() called");
		int i =5;
		if(i<=10) {
			System.out.println("if block executed");
			return 100+5;
			
		}
		else
		{
			System.out.println("else block executed");
			return 100-5;
			
		}
	}
	void meth5() {
		System.out.println("meth5() called");
		return ;
	}
	int meth6() {
		System.out.println("meth6() called");
		return 100;
	}
	void meth7(int a) {
		System.out.println("meth7() called");
		System.out.println("a value: "+a);
	}
	public static void main(String[] args) {
		System.out.println("start");
		ClassA024 obj = new ClassA024();
		obj.meth1();
		System.out.println("------");
		obj.meth2("java is awesome");
		System.out.println("---------");
		System.out.println("meth3() is returning "+obj.meth3(1, 'C'));
		System.out.println("------");
		obj.meth4();
		System.out.println("    ");
		obj.meth5();
		System.out.println("        ");
		obj.meth7(obj.meth6());
		System.out.println("End");
	}
}
