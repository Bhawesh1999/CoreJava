package CoreJava;

import java.security.DomainCombiner;

public class ClassA066 
{
	void meth1(int i)
	{
		System.out.println("-------meth1----------");
		while(i<=5)
		{
			System.out.println("i value:"+i);
			i++;
		}
		System.out.println("meth1() execution completed");
	}
	void meth2(int i)
	{
		System.out.println("--------meth2()--------");
		while(i<=3)
		{
			System.out.println("i value:"+(i++));
		}
		System.out.println("meth2() execution completed");
	}
	void meth3(int i)
	{
		System.out.println("----meth3()-----");
		while(i<=5)
		//int x=50;
			System.out.println("i value :"+i++);
		i++;
		System.out.println("==>"+(++i));
		System.out.println("meth3() execution completed");
		
	}
	void meth4(int i)
	{
		System.out.println("----meth4()-------");
		while(true)
		{
			System.out.println("i value :"+i);
			i++;
			break;
		}
		System.out.println("meth4() execution completed");
	}
	void meth5(int i)
	{
		System.out.println("---------meth5()----------");
		do
		{
			System.out.println("i value"+i);
			i++;
		}
		while(i<=5);
		{
			System.out.println("meth5() execution completed");
		}
	}
	public static void main(String[] args) 
	{
		ClassA066 obj = new ClassA066();
		obj.meth1(10);
		obj.meth2(1);
		obj.meth3(1);
		obj.meth4(1);
		obj.meth5(1);
	}
}