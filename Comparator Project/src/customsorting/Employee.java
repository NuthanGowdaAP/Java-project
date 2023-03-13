package customsorting;

public class Employee 
{
	String name;
	Double salary;  // Wrapper Class Declaration
	public Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return "Salary of "+name +" is "+salary;
	}
}
