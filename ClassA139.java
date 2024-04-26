package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassA139 
{
	void meth1()
	{
		System.out.println("Implementing arraylist");
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);//It allows duplicate and insertion order is maintained
	//	a1.add("java");//default capacity is 10
	//	a1.add(null);//if arraylist is full the capacity increase automatically
	//	a1.add('A');//new capacity=(current capacity *3/2)+1
		a1.add(85);//its not synchronize by default
		a1.add(10);//arraylist a1=new arraylist
		a1.add(85);//list a1 = collections.synchronizedlist(a1);
		a1.add(10);
		a1.add(96);
		a1.add(75);
		System.out.println(a1);
		System.out.println("size() :"+a1.size());
		System.out.println();
		System.out.println("retrieivng the data in forward direction by using for loop");
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i)+"  ");
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Retrieivng the data for using for each loop");
		for(int a:a1)
		{
			System.out.println(a+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Retriving the data by using interator interface");
		
		
		Iterator<Integer> i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("===========");
		//a1.clear();
		System.out.println("isEmpty():"+a1.isEmpty());
		System.out.println("contains() :"+a1.contains(96));
		System.out.println("remove():"+a1.remove((Object)96));
		System.out.println(a1);
		System.out.println("remove(): "+a1.remove(a1.size()-2));
		System.out.println(a1);
		a1.add(0,999);
		System.out.println(a1);
	}
	public static void main(String[] args) {
		new ClassA139().meth1();
	}

}
