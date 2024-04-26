package CoreJava;

import java.io.FileReader;
import java.io.IOException;

public class ClassA128 
{
	int avl_amt =10000;
	void meth1(int wd_amt)
	{
		if(wd_amt<avl_amt)
		{
			throw new ArithmeticException("Insufficient");
		}
		else
		{
			System.out.println("Transaction success");
		}
	}
	void meth2() throws Exception
	{
		System.out.println("meth2() called");
		FileReader fr = new FileReader("C:\\Users\\bhparate\\Downloads\\Test.txt");
	}
	public static void main(String[] args) throws Exception {
		ClassA128 obj = new ClassA128();
		obj.meth1(50000);
		obj.meth2();
	}

}
