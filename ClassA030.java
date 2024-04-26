package CoreJava;

public class ClassA030 
{
	String empName;
	int empSal;
	String empDept;
	
	static String CompanyName ="TCS";//There will be only one copy of static variable for entire program
	
	
	ClassA030(String name, int sal, String dept)
	{
		empName= name;
		empSal=sal;
		empDept=dept;
	}
	public static void main(String[] args) 
	{
		ClassA030 obj1 = new ClassA030("Raju",50000,"java");
		ClassA030 obj2 = new ClassA030("Raheem",500000,"AWS");
		ClassA030 obj3 = new ClassA030("John",6500000,"FSI");
		
		obj1.CompanyName ="HCL";//updated the CompanyName to "HCL" from "TCS"
		
		obj2.empName ="AHMED";//updated the CompanyName to "AHMED" from "raju"
		
		System.out.println("obj1 ==>"+obj1.empName+" "+obj1.empSal+" "+obj1.empDept+" "+obj1.CompanyName);
		
		System.out.println("obj2 ==>"+obj2.empName+" "+obj2.empSal+" "+obj2.empDept+" "+obj2.CompanyName);
		
		System.out.println("obj3 ==>"+obj3.empName+" "+obj3.empSal+" "+obj3.empDept+" "+obj3.CompanyName);
	}
}
