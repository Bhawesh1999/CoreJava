package CoreJava;

public class ClassB121 
{
	public static void main(String[] args) throws InterruptedException
	{
		ClassA121 obj = new ClassA121();
		obj.start();
		Thread.yield();
		obj.join();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class B");
		}
	}

}
