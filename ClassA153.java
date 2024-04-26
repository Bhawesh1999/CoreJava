package CoreJava;

public class ClassA153 
{
	void display()
	{
		System.out.println("Implementing lambda expressiong");
		InterfaceA153 x=()-> System.out.println("Hello World");
		x.meth1();
		
		InterfaceB153 y =(int a, int b)-> System.out.println("Addition +"+(a+b));
		y.meth2(99,1);
		
		InterfaceC153 z =(int m, int n)->
		{
			if(m<=100)
			{
				System.out.println("if block executed");
				return m+100;
			}
			else
			{
				System.out.println("else block executed");
				return n;
			}
		};
		int result =z.meth3(50,500);
		System.out.println("====>"+result);
	}
	public static void main(String[] args) {
		new ClassA153().display();
	}

}
