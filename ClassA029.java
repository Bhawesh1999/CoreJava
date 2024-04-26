package CoreJava;

public class ClassA029 
{
	public ClassA029()
	{
		System.out.println("sunday");
		ClassA029 obj = new ClassA029(10);
		System.out.println("Tuesday");
		String S = obj.display("challange accepted");
		System.out.println(S);
	}
	public ClassA029(int temp)
	{
		System.out.println("saturday");
		ClassA029 obj = new ClassA029(10,20);
		int a = obj.meth1()+temp;
		System.out.println("="+(a+obj.meth2()));
		System.out.println("monday");
	}
	String display(String S)
	{
		System.out.println("int the next statement I am returning string value");
		
		return S;
	}
	int meth1()
	{
		return 100;
	}
	int meth2()
	{
		return 99;
	}
	public ClassA029(int data, int temp)
	{
		System.out.println("Thursady");
		System.out.println("=>"+(data+new ClassA029("hi").meth2()-temp));
	}
	ClassA029(String S)
	{
		System.out.println(S);
	}
	public static void main(String[] args) 
	{
		ClassA029 obj = new ClassA029();
		System.out.println("output verified");
	}
	

}
