package CoreJava;

import java.util.Scanner;

public class ClassA126 
{
	void meth1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(10);
		String s=null;
		try {
			System.out.println("try block executed");
			System.out.println("Please enter a no");
			System.out.println("====>"+20/sc.nextInt());
			System.out.println("Hello world");
			}
		//System.out.println("Hi");
		catch(ArithmeticException obj)
		{
			System.out.println("1st catch block executed");
			obj.printStackTrace();
		}
		catch(NullPointerException obj)
		{
			System.out.println("2nd catch block executed");
			obj.printStackTrace();
		}
		//System.out.println("Hello");
		finally
		{
			System.out.println("finally block executed");
			sc.close();
			
		}
		System.out.println(30);
	}
	public static void main(String[] args)
	{
		new ClassA126().meth1();
	}

}
