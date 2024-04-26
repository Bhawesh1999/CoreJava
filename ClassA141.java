package CoreJava;


import java.util.Enumeration;
import java.util.Vector;

public class ClassA141 
{
	void meth1()
	{
		System.out.println("Implementing vector");
		Vector v = new Vector();
		v.add(10);//Insertion order maintained
		v.add("java");//Heterogenous data is allowed
		v.add(null);//null is allowed
		v.add(true);//duplicate are allowed
		v.add(10);//default capacity is 10
		v.add(96);//its size increases by double
		v.add(45);//it is available from java1.0
		v.add(5);//it is synchronized by default
		v.add(v);
		System.out.println("size() "+v.size());
		System.out.println("capacity() "+v.capacity());
		v.add(14);
		v.add(100);
		v.add(5);
		v.add(v);
		System.out.println("capacity() "+v.capacity());
		System.out.println("---------");
		for(int i=0; i<v.size()-1;i++)
		{
			System.out.println(v.get(i)+" ");
		}
		System.out.println();
		System.out.println("      ");
		for(Object o:v)
		{
			System.out.println(o+"  ");
		}
		System.out.println();
		System.out.println("========");
		Enumeration e =v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
	public static void main(String[] args)
	{
		new ClassA141().meth1();
	}
}
