package CoreJava;

public class ClassB124
{
	public static void main(String[] args) {
		ClassA124 obj = new ClassA124();
		new Thread()
		{
			@Override
			public void run()
			{
				try
				{
					obj.withdraw(15000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
		}
		}
		.start();
		
		new Thread()
		{
			@Override
			public void run()
			{
				obj.deposit(10000);
			}
		}
		.start();
	}

}
