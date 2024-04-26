package CoreJava;

public class ClassA027 
{
	public ClassA027(int a) {
		System.out.println("parameterized consturctor");
		new ClassA027();
	}
	public ClassA027() {
		System.out.println("Non paramterized constructor");
	}
	public void meth1(){
		System.out.println("meth1() called");
	}
	public static void main(String[] args) {
		ClassA027 obj = new ClassA027(34);
		obj.meth1();
		
	}

}
