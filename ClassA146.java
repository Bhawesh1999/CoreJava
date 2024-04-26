package CoreJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class ClassA146 
{
	void meth1()
	{
		System.out.println("Implementing set interface classes");
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(10);//insertion order is not maintained but sorting order is maintained
		//set.add("java");//Heterogeneous data is not allowed
		//set.add(null);//null is not allowed
		set.add(1);//duplicates are not allowed
		set.add(52);//it is available form java1.2
		set.add(25);//it is default capacity is 16
		set.add(19);//its size increases by default
		set.add(10);//its load factor is 0.75
		set.add(99);//it is not synchronized
		System.out.println(set);
		
		Iterator<Object> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
		System.out.println("\n");
		
		Iterator<Object> i2 = set.descendingIterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next()+" ");
		}
		System.out.println("\n");
		
		System.out.println("headset() :"+set.headSet(25));
		System.out.println("tailset() :"+set.tailSet(25));
		
		System.out.println("------");
		
		LinkedList<Object> ll=new LinkedList<Object>(set);
		ListIterator<Object> li = ll.listIterator();
		System.out.println(li);
	}
	public static void main(String[] args) 
	{
		new ClassA146().meth1();
		
	}

}
