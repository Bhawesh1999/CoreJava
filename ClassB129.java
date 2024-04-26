package CoreJava;

import java.util.Scanner;

public class ClassB129 
{
	static double current_balance=100;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amt to withdraw");
		int n =sc.nextInt();
		try{
			{
				if(current_balance<n)
				{
					throw new ClassA129("Insufficient fund! your current is"+current_balance);
				}
				else
				{
					System.out.println("please take the money"+n);
				}
			}
		}
		catch(ClassA129 e)
			{
				e.printStackTrace();
			}
			sc.close();
		}
	}


