package CoreJava;

public class ClassB118
{
	public static void main(String[] args) throws InterruptedException {
		ClassA118 obj = new ClassA118();
		obj.start();
		obj.join();
		for(int i=1;i<=5;i++)
		{
			System.out.println("ClassB :"+i);
		}
	}

}
