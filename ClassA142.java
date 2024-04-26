package CoreJava;

public class ClassA142 
{
	private String empName;
	private int empId;
	private String empDept;
	
	public ClassA142(String empName, int empId, String empDept)
	{
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}
	@Override
	public String toString()
	{
		return empName+"  "+empId+"  "+empDept;
	}

}
