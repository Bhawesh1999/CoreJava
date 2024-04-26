package CoreJava;

public class ClassA067 
{
	void meth1()
	{
		System.out.println("-----meth1()-----");
		for(int i=1;i<=5;i++)
		{
			System.out.println("i value"+i++);
		}
		System.out.println("meth1() executed");
	}
	void meth2()
	{
		System.out.println("---------meth2()-------");
		for(int i=1;i<=10;i++)
		{
			System.out.println("i value:"+i);
		}
		System.out.println("meth2() exectued");
	}
	void meth3()
	{
		System.out.println("---------meth3()-------");
		int i=1;
		for(;i<=5;)
		{
			System.out.println("i value :"+i);
			i++;
		}
		System.out.println("meth3() executed");
	}
	void meth4()
	{
		int i=1;
		for(System.out.println("----meth4()"), System.out.println("----"); i<3;)
		{
			System.out.println("i value :"+i++);
		}
		System.out.println("meth4() executed");
	}
	int meth5()
	{
		System.out.println("meth5() executed");
		return 1;
	}
	void meth6()
	{
		System.out.println("meth6() executed");
	}
	void meth7()
	{
		System.out.println("-----meth7()----");
		ClassA067 obj = new ClassA067();
		for(int i=obj.meth5();i<=3;new ClassA067().meth6())
		{
			System.out.println("meth7() executed");
			break;
		}
	
	}
	void meth8()
	{
	System.out.println("---meth8()----");
	int i=1;
	for(; ;)
	{
		System.out.println("i value :"+i++);
		break;
	}
	System.out.println("meth8() executed");
	}
	void meth9()
	{
		System.out.println("----meth9()------");
		int i=1;
		for(;i<=5;)
		{
			System.out.println("i value :"+i);
			break;
		}
		
		i++;
		System.out.println("meth9() executed");
		
	}
	public static void main(String[] args) 
	{
		ClassA067 obj = new ClassA067();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		obj.meth5();
		obj.meth6();
		obj.meth7();
		obj.meth8();
		obj.meth9();	
	}

}
