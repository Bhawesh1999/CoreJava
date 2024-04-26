package CoreJava;

public class ClassA064 
{
	void meth1()
	{
		System.out.println("implementing switch case");
		int a=65;
		byte b =30;
		
		final int x =10;//final value are constant
		//x++;C.E.
		//x++;C.E.
		
		switch(b+35)
		{
			//System.out.println("hello world");
		default:
			System.out.println("default case executed");
		break;
		case x:
			System.out.println("case 10 executed");
		break;
		case 'A':
		System.out.println("case 65 executed");
		System.out.println("int and char both are compatible datatypes");
		if(a=='A')
		{
			System.out.println((char)++a);
			if(!((char)++a<='B'))
			{
				System.out.println((char)++a);
				System.out.println(!((char)++a<='B'));
			}
		}
		else
		{
			System.out.println(a++);
		}
		break;
		case 300+100:
			System.out.println("case 30 executed");
			break;
		case 40:
			System.out.println("case 40 executed");
			break;
		case 50:
			System.out.println("case 50 executed");
			break;
		}
		System.out.println("compiler came out from switch");
	}
	int meth2()
	{
		System.out.println("meth2() called");
		return 1;
	}
	public static void main(String[] args) 
	{
		System.out.println("start");
		ClassA064 obj = new ClassA064();
		obj.meth1();
		System.out.println("End");
		
	}

}
