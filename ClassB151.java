package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassB151 
{
	void meth1()
	{
		ArrayList<ClassA151> al = new ArrayList<ClassA151>();
		ClassA151 obj1 = new ClassA151("Kishan",101,"java");
		ClassA151 obj2 = new ClassA151("Afroze",105,"AWS");
		ClassA151 obj3 = new ClassA151("Rache",104,"CLoud");
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		Iterator<ClassA151> i2 = al.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("         ");
		Collections.sort(al);
		Iterator<ClassA151> i21 = al.iterator();
		while(i21.hasNext())
		{
			System.out.println(i21.next());
		}
				
		
	}
	public static void main(String[] args)
	{
		new ClassB151().meth1();
	}

}
