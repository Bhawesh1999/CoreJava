package CoreJava;

public class ClassA116 extends Thread
{
	public void run()
	{
		for(int i =1; i<=5; i++)
		{
			System.out.println("run() executed "+i);
		}
	}
	public static void main(String[] args) 
	{
		ClassA116 obj = new ClassA116();
		Thread t1 = new Thread(obj);
		t1.start();//A new thread will be created and that thread is responsible for running the run() present in ClassA
		t1.run();//No new thread will be created ClassA116 run() will be executed just like normal method call
		
		Thread t2 = new Thread(obj);
		t2.start();//A new thread will be created and that thread is responsible for running the run() present in thread class
		t2.run();//no new thread will be created, thread run() will be executed just like normal method call
	}

}
