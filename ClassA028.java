package CoreJava;

public class ClassA028 
{
	int meth1() {
		System.out.println("meth1() called");
		return 99;
	}
	int meth2() {
		System.out.println("meth2() called");
		return 9;
	}
	ClassA028(){
		System.out.println(new ClassA028("Hello").meth1()+1);
		System.out.println("Hi");
	}
	ClassA028(String S){
		System.out.println(S);
	}
	public static void main(String[] args) {
		System.out.println(new ClassA028().meth2()+1);
	}

}
