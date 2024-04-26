package CoreJava;

public class ClassA041 
{
	void person(int age)
	{
		if((age >=21  ||  age<=35))
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
	void meth1()
	{
			int x=100;
			if(!(x==100))
			{
				System.out.println("hi");
			}
			else
			{
				System.out.println("hello");
			}
	}
	public static void main(String[] args) 
	{
			ClassA041 obj = new ClassA041();
			obj.person(45);
			obj.meth1();
		}
}
