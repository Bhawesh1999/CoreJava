package CoreJava;

import java.io.*;

public class ClassA136 
{
	void meth1() throws Exception
	{
		System.out.println("Implementing datastreams");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\bhparate\\Downloads\\Test2.txt"));
		
		System.out.println("connection created");
		
		dos.writeInt(1000);
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.writeInt(2000);
		
		System.out.println("Data entered");
	dos.close();
	
	DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\bhparate\\Downloads\\Test.txt"));
	
	System.out.println("connection created");
	
	System.out.println(dis.readInt());
	System.out.println(dis.readChar());
	System.out.println(dis.readBoolean());
	System.out.println(dis.readInt());
	System.out.println("data retrieved");
	dis.close();
	}
	public static void main(String[] args) throws Exception{
		ClassA136 obj = new ClassA136();
		obj.meth1();
	}

}
