package CoreJava;

import java.io.*;

public class ClassA135 
{
	void fileOperatinos() throws Exception
	{
		System.out.println("Reading the data by using buffered byte stream");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\bhparate\\Downloads\\Test.txt"));
		
		int i;
		while((i=bis.read())!=-1)
		{
			System.out.println((char)i);
		}
		System.out.println();
		System.out.println("data retrieved");
		bis.close();
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\bhparate\\Downloads\\Test2.txt"));
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\bhparate\\Downloads\\Test.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\bhparate\\Downloads\\Test2.txt"));
		
		bos.close();
		br.close();
		bw.close();
		
	}
	public static void main(String[] args) throws Exception 
	{
		ClassA135 obj = new ClassA135();
		obj.fileOperatinos();
	}

}
