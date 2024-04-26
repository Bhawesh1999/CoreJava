package CoreJava;

public class ClassA062 
{
	void employee(int salary, int yearOfService)
	{
		int bonus, updateSalary;
		
		if (yearOfService>=5)
		{
			bonus =(salary/100)*5;
			updateSalary = salary+bonus;
			System.out.println("employee bonys amount"+bonus);
			System.out.println("employee update salary is"+updateSalary );
		}
	}
	public static void main(String[] args) {
		new ClassA062().employee(5000,6);
	}
}
