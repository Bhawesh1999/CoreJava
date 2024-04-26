package CoreJava;

public class ClassA118 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("ClassA"+i);
		}
	}
}
