package CoreJava;

import java.util.Scanner;

public class ClassA074 
{
	static Scanner sc= new Scanner(System.in);
	void meth1()
	{
		System.out.println("pls enter your name");
		String empName = sc.next();
		System.out.println("please enter your employee ID");
		int empID= sc.nextInt();
		System.out.println("pls enter your salary");
		double empSal = sc.nextDouble();
		System.out.println("please enter your address");
		sc.nextLine();
		String empAddr = sc.nextLine();
		
		System.out.println("Empdetails is");
		System.out.println("empName"+empName);
		System.out.println("empID"+empID);
		System.out.println("empsal"+empSal);
		System.out.println("empAddr"+empAddr);
	}
	public static void main(String[] args) 
	{
		new ClassA074().meth1();
		
	}

}
