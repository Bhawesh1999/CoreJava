package CoreJava;

public class ClassA026 
{
	int a =10;//instance variable
	static  int b=20; //static var

	int x;
	static int y;
	
	//static String a="java"; //Compile error because of duplicate identifier name
	
	//int a=1000;//Compile error because of identifier name
	
	void meth1()
	{
		System.out.println("meth1() called");
		int C=30;//local variable
		System.out.println("instance varible a:"+a);//direct calling
		System.out.println("instanc evariable a :"+new ClassA026().a);//calling with new instance
		System.out.println("------");
		System.out.println("static variable b:"+b);//directly calling
		System.out.println("static varibale B:"+new ClassA026().b);//calling with new instance
		System.out.println("static varibale b:"+ClassA026.b);//calling with class name
		System.out.println("--------");
		System.out.println("Local variable C :"+C);//direct calling
	}
	void meth2()
	{
		System.out.println("meth2() called");
		System.out.println("Instance variable a:"+a);//direct calling
		System.out.println("Static variable b :"+b);//direct calling
	}
	void meth3()
	{
		System.out.println("meth3() called");
		int a =100;//local variable
		int b =200;//local variable
		System.out.println("Instance variable a:"+new ClassA026().a);//calling with new instance class
		System.out.println("Static variable b:"+ClassA026.b);//calling directly referein class
		System.out.println("Local variable :"+a+" b:"+b);
	}
	void meth4()
	{
		System.out.println("meth4() called");
		int z;//local variable
		System.out.println("Instance variable x:"+x);//null value
		System.out.println("static varibale y:"+y);//null value
	}
	public static void main(String[] args) 
	{
		ClassA026 obj = new ClassA026();
		obj.meth1();
		System.out.println("-----");
		obj.meth2();
		System.out.println("-----");
		obj.meth3();
		System.out.println("---");
		obj.meth4();
		
	}
	

}
