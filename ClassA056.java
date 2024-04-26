package CoreJava;

public class ClassA056 
{
	void meth1()
	{
		System.out.println("performing autoboxing ");
		int  i =50;
		Integer ival1 = new Integer(i);
		Integer ival2 = i;
		Integer ival3 = Integer.valueOf(i);
		System.out.println("integer value :"+i);
		System.out.println(" Wrapper object :"+ival1);
		System.out.println(" Wrapper object :"+ival2);
		System.out.println(" Wrapper object :"+ival3);
		System.out.println();
		
		byte b =100;
		Byte bval1 = new Byte(b);
		Byte bval2 = b;
		Byte bval3 = Byte.valueOf(b);
		System.out.println("byte value :"+b);
		System.out.println("wrapper class object :"+bval1);
		System.out.println("wrapper class object :"+bval2);
		System.out.println("wrapper class object :"+bval3);
		System.out.println();
		
		char C ='A';
		Character cval1 = new Character(C);
		Character cval2 = Character.valueOf(C);
		Character cval3 = C;
		System.out.println("character value :"+C);
		System.out.println("wrapper class object :"+cval1);
		System.out.println("wrapper class object :"+cval2);
		System.out.println("wrapper class object :"+cval3);
		System.out.println();
		
		
		
	}
	void meth2()
	{
		System.out.println("performing Auto-Unboxing");
		Byte bval = new Byte((byte)50);
		byte b1 = bval;
		byte b2 = bval.byteValue();
		System.out.println("Byte WCO value"+bval);
		System.out.println("Byte PDT value:"+b1);
		System.out.println("Byte pDT value :"+b2);
		System.out.println("-------");
		
		Float fval = new Float(10.9f);
		float f1 =fval;
		float f2 =fval.floatValue();
		System.out.println("float WCO value:"+fval);
		System.out.println("float PDT value:"+f1);
		System.out.println("float PDT value:"+f2);
		System.out.println("---------");
		
		Boolean booleanval = new Boolean(true);
		Boolean d1 =booleanval;
		boolean flag = booleanval.booleanValue();
		System.out.println("Boolean WCO value:"+booleanval);
		System.out.println("boolean PDT value :"+flag);
		System.out.println("boolean pdt value :"+d1);
	}
	void meth3()
	{
		Integer ival1 = new Integer(100);
		Integer ival2 = new Integer("200");
		//Integer ival3 = new Integer("java");
		System.out.println("ival1:"+ival1);
		System.out.println("ival2 :"+ival2);
		System.out.println("---------");
		
		Boolean bval1 = new Boolean("true");
		Boolean bval2 = new Boolean("truE");
		Boolean bval3 = new Boolean("Kishan");
		Boolean bval4 = new Boolean("FAlse");
		
		System.out.println("bval:"+bval1);
		System.out.println("bval:"+bval2);
		System.out.println("bval:"+bval3);
		System.out.println("bval:"+bval4);
		System.out.println("-----");
		
		//new Character ("java");
		new Character('J');
	}
	public static void main(String[] args) {
		ClassA056 obj = new ClassA056();
		obj.meth1();
		System.out.println("----------");
		obj.meth2();
		System.out.println(("_----"));
		obj.meth3();
	}

}
