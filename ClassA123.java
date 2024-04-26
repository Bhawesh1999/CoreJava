package CoreJava;

public class ClassA123
{
	public static void main(String[] args) 
	{
		final String A="Java";
		final String B="Python";
		
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				synchronized(A)
				{
					System.out.println("Thread 1 locked on A");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(B)
					{
						System.out.println("Thread 1 loecked on B");
					}
					System.out.println("no dead lock");
				}
			}
		}
		;
		Thread t2 = new Thread()
		{
			public void run()
			{
				synchronized(B)
				{
					System.out.println("Thread2 locked on B");
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(B)
					{
						System.out.println("Threas 2 locked on A");
					}
				}
				System.out.println("no dead locke");
			}
		}
		;
		t1.start();
		t2.start();
		
	}

}
