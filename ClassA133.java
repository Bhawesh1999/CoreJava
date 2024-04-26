package CoreJava;

import java.io.*;

public class ClassA133 
{
	void fileOperations1() throws Exception
	{
		System.out.println("Reading the data from a file");
		FileInputStream fis=new FileInputStream("C:\\Users\\bhparate\\Downloads\\Test.txt");
		
		System.out.println("connection created");
		int i;
		while((i=fis.read())!=-1);
		{
			System.out.println((char)i);
		}
		System.out.println();
		System.out.println("DataRetrieved");
		fis.close();
	}
	void fileOperations2() throws Exception
	{
		System.out.println("Writing the data into a file");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\bhparate\\Downloads\\Test2.txt");
		System.out.println("Connection created");
		String data = "because it is awesome";
		byte arr[] = data.getBytes();
		fos.write(arr);
		System.out.println("data entered");
		fos.close();
	}
	void fileOperations3() throws Exception
	{
		System.out.println("copy the data from one file into another file");
		FileInputStream fis = new FileInputStream("C:\\Users\\bhparate\\Downloads\\Test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\bhparate\\OneDrive - Capgemini\\Documents\\OneDrive - Capgemini\\Desktop\\Test2.txt");
		
		System.out.println("COnnection created");
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("data copied");
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws Exception {
		ClassA133 obj = new ClassA133();
		obj.fileOperations1();
		obj.fileOperations2();
		obj.fileOperations3();
	}

}
