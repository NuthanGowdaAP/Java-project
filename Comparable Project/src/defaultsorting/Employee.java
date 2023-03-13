package defaultsorting;

public class Employee implements Comparable<Employee>
{
	String name;
	Double sal;   // using Wrapper class (we not loss decimal values)
	//taking the help of comaparTo() of Double class
	public Employee(String name,double sal)
	{
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString()
	{
		return "Salary of "+name +" is "+sal+" LPA";
	}
	@Override
	public int compareTo(Employee e)
	{
		//comaring based on name(String)
		// return this.name.compareTo(e.name);  // acending Order
		//  return e.name.compareTo(this.name);  // descending Order

		//comaring based on sal(Double)
		   return this.sal.compareTo(e.sal);  // acending Order
		// return e.sal.compareTo(this.sal);  // descending Order
	}
}