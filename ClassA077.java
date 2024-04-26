package CoreJava;

public class ClassA077 
{
	int x=10;
	static int y=20;
	void meth1()
	{
		int x =1000;
		int y=2000;
		int z=3000;
		System.out.println("Instance variable :"+this.x);
		System.out.println("Local variable :"+x);
		System.out.println("-----");
		System.out.println("static variable :"+ClassA077.y);
		System.out.println("Static variable :"+this.y);
		System.out.println("Local Variable :"+z);
		
	}
	public static void main(String[] args) {
		new ClassA077().meth1();
	}

}
