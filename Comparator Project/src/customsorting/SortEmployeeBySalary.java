package customsorting;
import java.util.Comparator;
public class SortEmployeeBySalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) 
	{
        return o1.salary.compareTo(o2.salary); //acending oredr
		//return o2.salary.compareTo(o1.salary); //descendin order
		
// o1-> object to be inserted
// o2-> already existing object
	}
}
