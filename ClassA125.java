package CoreJava;

import java.util.Scanner;
import java.lang.Error;

public class ClassA125
{
	void meth1() {
		Scanner sc = new Scanner(System.in);
		System.out.println(10);
		try
		{
			System.out.println("try block executed");
			System.out.println("please enter a no");
			System.out.println("==>"+20/sc.nextInt());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cathc block executed");
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block executed");
			sc.close();
		}
		System.out.println(30);
	}
	public static void main(String[] args)
	{
		new ClassA125().meth1();
	}

}
