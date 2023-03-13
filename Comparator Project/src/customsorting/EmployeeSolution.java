package customsorting;

import java.util.*;
public class EmployeeSolution
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee("manju",5.5);  // 3 employee object is created
		Employee e2=new Employee("kalasa",6.5);
		Employee e3=new Employee("abc",5.3);
		Map<Integer,Employee> map=new LinkedHashMap<Integer,Employee>();
		map.put(100,e1);
		map.put(200,e2);
		map.put(300,e3);
		Set<Integer> keys=map.keySet();
		List<Employee>list=new ArrayList<Employee>();
		for(Integer key:keys)
		{
			Employee emp=map.get(key);
			System.out.println(emp);
			list.add(emp);			
		}
		System.out.println("-------------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Sort By name\n2:Sort By Salary");
		System.out.println("Enter Choice");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			Collections.sort(list,new SortEmployeeByName());
			for(Employee e:list)
			{
				System.out.println(e);
			}
			break;
		case 2:
			Collections.sort(list,new SortEmployeeBySalary());
			for(Employee e:list)
			{
				System.out.println(e);
			}
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
