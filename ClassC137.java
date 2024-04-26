package CoreJava;

import java.io.*;

public class ClassC137 
{
	void meth1() throws Exception
	{
		System.out.println("Implementing serialization");
		ClassA137 aobj1 = new ClassA137();
		ClassB137 bobj1 = new ClassB137();
		
		System.out.println(aobj1.a+"  "+aobj1.b);
		System.out.println(bobj1.x+"  "+bobj1.y);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream ("C:\\Users\\bhparate\\Downloads\\Test2.txt"));
		System.out.println("connection created");
		
		oos.writeObject(aobj1);
		oos.writeObject(bobj1);
		
		System.out.println("Serialization completed");
		oos.close();
		
		System.out.println("------");
		
		System.out.println("De-serialization started");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\bhparate\\Downloads\\Test2.txt"));
		System.out.println("connection created");
		
		ClassA137 aobj2 = (ClassA137)ois.readObject();
		ClassB137 bobj2 = (ClassB137)ois.readObject();
		
		System.out.println(aobj2.a +"  "+aobj2.b);
		System.out.println((bobj2.x+"  "+bobj2.y));
		
		ois.close();
	}
public static void main(String[] args) throws Exception{
	new ClassC137().meth1();
}
}
