package CoreJava;

public class ClassA152 
{
	private String empName;
	private int empId;
	private String empDept;
	
	
	public ClassA152(String empName, int empId, String empDept)
	{
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpdId()
	{
		return empId;
	}
	public String getEmpDept()
	{
		return empDept;
	}
	@Override
	public String toString()
	{
		return empName+"      "+empId+"    "+empDept;
	}

}
