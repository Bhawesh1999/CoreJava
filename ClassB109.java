package CoreJava;

public class ClassB109 extends ClassA109
{

	void display()
	{
		System.out.println("hi");
	}
	static int show(int a)
	{
			System.out.println(a+a);
			return a+a++;
	}
	ClassB109()
	{
		this(show(50));
		for(int i=1;;i++)
		{
			super.meth4();
			break;
		}
		System.out.println("hi");
		System.out.println(show(50));
	}
	ClassB109(int a)
	{
		System.out.println("=>"+(a+++show(50)));
	}
	public static void main(String[] args) {
		new ClassB109().display();
	}
}
