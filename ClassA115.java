package CoreJava;

public class ClassA115 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("run() executed :"+i);
		}
	}
	public static void main(String[] args) {
		ClassA115 obj = new ClassA115();
		Thread t = new Thread(obj);
		t.start();
	}

}
