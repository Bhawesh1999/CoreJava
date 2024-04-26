package CoreJava;

import java.util.Scanner;

public class ClassA154 
{
	void check()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int i =sc.nextInt();
		if(i%2==0)
		{
			System.out.println(i+"is even number");
		}
		else
		{
			System.out.println(i+"is a odd number");
		}
		sc.close();
	}
	static void msg()
	{
		System.out.println("java is awesome");
	}
	ClassA154()
	{
		System.out.println("constructor reference");
	}

}
