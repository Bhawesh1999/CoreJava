package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class ClassA145 
{
	void meth1()
	{
		System.out.println("Implementing set Interface classes");
		//Hashset<Object>set = new Hashset<Object>();
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add(10);//Insertion order is not maintained
		set.add("java");//Heterogeneous data is allowed
		set.add(null);//null is allowed
		set.add(1);//duplicates are not allowed
		set.add(52);//its default capacity is 16
		set.add(25);//its size increases by double
		set.add(29);//its load factor is 0.75
		set.add(10);//it is not synchronized
		set.add(set);
		System.out.println(set);
		//System.out.println(set.get(5));
		System.out.println("------");
		System.out.println("Using iterator");
		Iterator<Object> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("-------");
		ArrayList<Object> al = new ArrayList<Object>(set);
		System.out.println();
		ListIterator<Object> li = al.listIterator();
		while(li.hasNext())
			{
			System.out.println(li.next()+"  ");
			}
		System.out.println("\n");
		while(li.hasPrevious())
		{
			System.out.println(li.previous()+" ");
		}
	}
	public static void main(String[] args)
	{
		new ClassA145().meth1();
	}
}
