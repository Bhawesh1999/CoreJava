package CoreJava;

import java.util.ArrayList;

public class ClassA138 
{
	void meth1()
	{
		System.out.println("Implementing Arraylist");
		ArrayList a1 = new ArrayList();
		a1.add(10);//Insertion order is maintained
		a1.add("java");//duplicate are allowed
		a1.add(null);//null is allowed
		a1.add('A');//Heterogeneous data is allowed
		a1.add(85);//it is available from java
		a1.add(10);
		a1.add(96);
		a1.add(75);
		System.out.println(a1);
	}
	public static void main(String[] args) 
	{
		new ClassA138().meth1();
	}

}
