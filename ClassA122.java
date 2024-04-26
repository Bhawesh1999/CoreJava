package CoreJava;


public class ClassA122 extends Thread
{
	@Override
	public void run()
	{
		CriticalResource();
	}
	synchronized void CriticalResource()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+"has entered criticalResouce");
		{
			for(int i =1;i<=5;i++)
			{
				System.out.println(name +"i value"+i);
			}
			System.out.println(name +"has completed critical resource");
		}
		
	}
	public static void main(String[] args) {
		ClassA122 obj = new ClassA122();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("First-Thread");
		t2.setName("Second-thread");
		t1.start();
		t2.start();
	}
	

}
