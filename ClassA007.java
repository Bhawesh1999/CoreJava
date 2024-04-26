package CoreJava;


public class ClassA007 
{
void meth1(int x, int y)
{
	System.out.println("Addition"+(x+y));
	System.out.println("x value"+x);
}
void meth2(String msg) {
	new ClassA007().meth1(99,1);
	System.out.println("message is :"+msg);
}
void meth3(int a, int b, int c) {
	System.out.println("a value: "+a);
	new ClassA007().meth2("java is awesome");
	System.out.println("Arithmatic operation result :"+(a+b)*c);
}
public static void main(String[] args) {
	System.out.println("start");
	new ClassA007().meth3(5, 3, 2);
	System.out.println("End");
}
}
