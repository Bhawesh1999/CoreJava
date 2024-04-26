package CoreJava;

public class ClassA120 extends Thread
{
	public void run()
	{
		System.out.println("I am ready for interview");
		for(int i=1;i<=5;i++)
		{
			System.out.println("This is my "+i+"interview");
		}
		System.out.println("I got placed now I can relax");
		try 
		{
			Thread.sleep(15000);
		}
		catch(Exception e)
		{
			System.out.println("my sleep got disturbed");
		}
		System.out.println("time to go for office");
	}
	public static void main(String[] args) {
		ClassA120 obj = new ClassA120();
		Thread t = new Thread(obj);
		t.start();
		t.interrupt();
	}

}
