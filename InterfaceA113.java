package CoreJava;

public interface InterfaceA113 
{
	void meth1();
	
	default void meth2()
	{
		System.out.println("default meth2() called");
		this.meth4();
	}
	static void meth3()
	{
		System.out.println("static meth3() called");
	}
	private void meth4()
	{
		System.out.println("private meth4() called");
	}
	public static void main(String[] args) {
		System.out.println("Interface main() called");
		InterfaceA113.meth3();
	}

}
