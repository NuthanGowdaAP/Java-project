package defaultsorting;

import java.util.TreeSet;

public class EmployeeSort 
{
	public static void main(String[] args) {
		Employee e1=new Employee("manju",2.5);
		Employee e2=new Employee("kalasa",3.5);
		Employee e3=new Employee("abc",4.5);
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		for( Employee e:t)
		{
			System.out.println(e);
		}
	}
}