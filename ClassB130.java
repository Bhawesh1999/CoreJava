package CoreJava;


public class ClassB130 implements Cloneable
{
	int x =100;
	int y=200;
	
	ClassB130 meth1() throws CloneNotSupportedException
	{
		ClassB130 obj = (ClassB130)super.clone();
		return obj;
}

}
