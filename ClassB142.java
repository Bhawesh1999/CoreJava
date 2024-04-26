package CoreJava;

import java.util.Iterator;
import java.util.Vector;

public class ClassB142 
{
	void meth1()
	{
		System.out.println("passing user difne object into collection class");
		Vector<ClassA142> v= new Vector<ClassA142>();
		v.add(new ClassA142("Raju",101,"MCA"));
		v.add(new ClassA142("Raheem",106,"BSC"));
		v.add(new ClassA142("Rani",191,"MSC"));
		System.out.println(v);
		Iterator<ClassA142> i = v.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
	}
	public static void main(String[] args) {
		new ClassB142().meth1();
	}

}
