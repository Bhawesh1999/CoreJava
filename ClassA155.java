package CoreJava;

public class ClassA155 
{
	void display()
	{
		InterfaceA155 obj =x ->System.out.println(x*x);
		obj.meth1(5);
		System.out.println("========");
		InterfaceB155 bobj =(y,val)->
		{
			System.out.println(y+y);
			System.out.println(val);
		};
		bobj.meth2(10,"java");
	}
	public static void main(String[] args) 
	{
		new ClassA155().display();
	}

}
