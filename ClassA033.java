package CoreJava;

public class ClassA033 
{
	int amount =500;
	ClassA033()
	{
		System.out.println("Balance "+amount);
	}
	ClassA033(int deposit)
	{
		System.out.println("update balance is "+(amount+deposit));
	}
	public static void main(String[] args) 
	{
		new ClassA033();
		new ClassA033(100);
		
	}

}
