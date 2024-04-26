package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassB140
{
	void meth1()
	{
		System.out.println("passing user defined onject into a collection class");
		
		ArrayList<ClassA140> a1 = new ArrayList<ClassA140>();
		ClassA140 obj1 = new ClassA140("Kishan",101,"java");
		ClassA140 obj2 = new ClassA140("Vijay",103,"aws");
		ClassA140 obj3 = new ClassA140("Ghose",104,"cloed");
		
		a1.add(obj1);
		a1.add(obj2);
		a1.add(obj3);
		a1.add(new ClassA140("shreekanth",104,"u1"));
		System.out.println(a1);
		System.out.println("=====");
		Iterator<ClassA140> i=a1.iterator();
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		new ClassB140().meth1();
	}

}
