package CoreJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class ClassA143 
{
	void meth1()
	{
		System.out.println("ImplementObjectnkedList");
		LinkedList<Object> li = new LinkedList();
		li.add(10);//insertion order is maintained
		li.add("java");//Heterogeneous data is allowed
		li.add(null);//null is allowed
		li.add(1);//duplicate are allowed
		li.add(85);//it is available from java 1.2
		li.add(56);//its default capacity is 0
		li.add(10);//its size increase by double
		li.add(99);///it is not synchronized
		li.add(65);//in linked data will be stored in the form of nodes
		System.out.println(li);
		System.out.println("reteriving using for loop");
		for(Object o:li)
		{
			System.out.println(o);
		}
		System.out.println("======");
		System.out.println("retriving using listiterator");
		ListIterator<Object> l1 = li.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println();
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		System.out.println();
		System.out.println("======");
		System.out.println("=======");
		//l1.remove(Object)56);
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		li.addFirst("java is awesome");
		li.addLast(true);
		System.out.println(li);
	}
	public static void main(String[] args) 
		{
	new ClassA143().meth1();
		}
}
