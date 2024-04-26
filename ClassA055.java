package CoreJava;

public class ClassA055 
{
	void meth1()
	{
		int i =10;
		Integer ival =new Integer(i);
		System.out.println("integer value : "+i);
		System.out.println("wrapper class object :"+ival);
	}
	public static void main(String[] args) {
		new ClassA055().meth1();
	}

}
