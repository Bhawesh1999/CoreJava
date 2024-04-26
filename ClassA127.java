package CoreJava;

import java.util.Scanner;

public class ClassA127 
{
	void meth1()
	{
		Scanner sc = new Scanner(System.in);
		String s = null;
		
		System.out.println(10);
		try
		{
			System.out.println("try block executed");
			System.out.println("please enter a number");
			System.out.println(20/sc.nextInt());
			System.out.println("length :"+s.length());
		}
		catch(ArithmeticException  | NullPointerException e)
		{
			System.out.println("catch block executed");
			e.printStackTrace();
		}
		finally
		{
			sc.close();
			System.out.println("finally block executed");
		}
		
	}
	public static void main(String[] args) 
	{
		new ClassA127().meth1();
		
	}

}
