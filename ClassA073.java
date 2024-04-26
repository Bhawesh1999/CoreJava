package CoreJava;

import java.util.Scanner;

public class ClassA073 
{
	static Scanner sc= new Scanner(System.in);
	
	void meth1()
	{
		System.out.println("meth1() called");
		//Scanner sc = new Scanner(System.in);
		System.out.println("please enter 1st no");
		int a =sc.nextInt();
		System.out.println("a value :"+a);
		System.out.println("please enter 2nd no");
		int b = sc.nextInt();
		System.out.println("b value :"+b);
		int c=a+b;
		System.out.println("v value :"+c);
		
		//sc.close();
	}
	void checkAge()
	{
		System.out.println("checking the eligibility to vote");
		//Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name");
		//String name = sc.next();
		//System.out.println("user  name is "+name);
		String name = sc.nextLine();
		System.out.println("please enter your age");
		int age = sc.nextInt();
		
		if(age>=18)
		System.out.println(name +"you are eleigible to vote");
		else
			System.out.println(name +"you are not eligible to vote");
		//sc.close();
	}
	int meth3(int a, int b)
	{
		System.out.println("meth3() called");
		return a+b+sc.nextInt();
	}
	public static void main(String[] args) 
	{
		ClassA073 obj = new ClassA073();
		obj.meth1();
		obj.checkAge();
		System.out.println("please enter parameter value");
		int x= obj.meth3(sc.nextInt(), sc.nextInt());
		System.out.println("x value:"+x);	
	}
}
