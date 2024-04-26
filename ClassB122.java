package CoreJava;

public class ClassB122 extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+"has enterd block()");
		
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+"i value"+i);
			}
		}
		System.out.println(name +"has completed black()");
	}
	public static void main(String[] args) {
		ClassB122 obj = new ClassB122();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.start();
		t2.start();
	}

}
