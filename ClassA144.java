package CoreJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class ClassA144 
{
	private static Object arr[];
	static
	{
		arr = new Object[10000];
		for(int i=0;i<arr.length;i++)
		arr[i]=new Object();
		
	}
	void ArrayListTime()
	{
		long start;
		long end;
		ArrayList<Object> al = new ArrayList<Object>();
		
		start = System.currentTimeMillis();
		for(Object obj1:arr)
		{
			al.add(obj1);
		}
		end=System.currentTimeMillis();
		System.out.println("Arraylist cnstruction time"+(end-start));
	}
	void LinkedListTime()
	{
	long start, end;
	LinkedList<Object> ll = new LinkedList<Object>();
	start = System.currentTimeMillis();
	for(Object obj2:arr)
	{
		ll.add(obj2);
	}
	end=System.currentTimeMillis();
	System.out.println("LinkedList Constructor TIme"+(end-start));
	}
	void meth1()
	{
		for(Object o:arr)
		System.out.println(o);
	}
	public static void main(String[] args) 
	{
		ClassA144 lt = new ClassA144();
		lt.ArrayListTime();
		lt.LinkedListTime();
		lt.meth1();
	}

}
