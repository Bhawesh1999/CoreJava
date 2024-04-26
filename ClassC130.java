package CoreJava;

public class ClassC130 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		System.out.println("Implements object cloning");
		ClassA130 aobj1 = new ClassA130();
		System.out.println(aobj1.a+" "+aobj1.b);
		System.out.println(" ==========");
		ClassA130 aobj2 = aobj1;
		aobj2.b=999;
		
		System.out.println(aobj1.a+" "+aobj1.b+"===>"+aobj2.b);
		
		ClassB130 bobj1 =new ClassB130();
		System.out.println(bobj1.x +"  "+bobj1.y);
		ClassB130 bobj2 = new ClassB130();
		bobj2.y=999;
		System.out.println(bobj1.x+" "+bobj1.y+" ====="+bobj2.y);
		System.out.println("bobj2.x:"+bobj2.x);
	}
}
