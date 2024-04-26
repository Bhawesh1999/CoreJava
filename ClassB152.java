package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassB152 
{
	void meth1()
	{
		ArrayList<ClassA152> al = new ArrayList<ClassA152>();
		
		ClassA152 obj1 = new ClassA152("Kishan", 101, "java");
		ClassA152 obj2 = new ClassA152("Ram", 102, "AWS");
		ClassA152 obj3 = new ClassA152("sham", 103, "cloud");
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		
		
		Iterator<ClassA152> i = al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("      ");
		Collections.sort(al,new ClassC152());
		Iterator<ClassA152> i2= al.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
	public static void main(String[] args) 
	{
		new ClassB152().meth1();
		
	}
	

}
