package CoreJava;

import java.io.FileReader;
import java.io.FileWriter;

public class ClassA134 
{
	void fileOperator1() throws Exception
	{
		System.out.println("Reading the data from a file");
		FileReader fr = new FileReader("C:\\Users\\bhparate\\Downloads\\Test.txt");
		System.out.println("Connection created");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Data retrieved");
		fr.close();
	}
	
	void fileOperator2() throws Exception
	{
		System.out.println("Write the data into a file");
		FileWriter fw = new FileWriter("C:\\Users\\bhparate\\Downloads\\Test2.txt");
		System.out.println("Connection created");
		String data = "It's KFC day";
		fw.write(data);
		System.out.println("Data entered");
		fw.close();		
	}
	
	void fileOperator3() throws Exception
	{
		System.out.println("Copying the data from one file to another file");
		FileReader fr = new FileReader("C:\\Users\\bhparate\\Downloads\\Test.txt");
		FileWriter fw = new FileWriter("C:\\Users\\bhparate\\Downloads\\TestCopy.txt");
		System.out.println("Connection created");
		int i;
		while((i=fr.read())!=-1)
		{
			fw.write(i);
		}
		System.out.println("Data copied");
		fr.close();
		fw.close();
	}
	
	public static void main(String[] args) 
	{
		ClassA134 obj = new ClassA134();
		try {
			obj.fileOperator1();
			obj.fileOperator2();
			obj.fileOperator3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
