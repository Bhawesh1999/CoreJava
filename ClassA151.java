package CoreJava;

public class ClassA151 implements Comparable<ClassA151>
{
	String empName;
	int empId;
	String empDept;
		
		public ClassA151(String empName, int empId, String empDept)
		{
			this.empName=empName;
			this.empId=empId;
			this.empDept=empDept;
		}
		@Override
		public String toString() {
			return empName+"  "+empId+"   "+empDept;
		}
		@Override
		public int compareTo(ClassA151 o)
		{
			//return this.empId-o.empId;
			//return this.empName.compareTo(o.empName);
			return this.empDept.compareTo(o.empDept);
		}
	}