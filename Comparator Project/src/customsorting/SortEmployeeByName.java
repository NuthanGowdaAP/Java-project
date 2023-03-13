package customsorting;
import java.util.Comparator;
public class SortEmployeeByName implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) 
	{
		return o1.name.compareTo(o2.name); //acending oredr
		//      return o2.name.compareTo(o1.name); //descending order

		// o1-> object to be inserted 
		// o2-> already existing object
	}
}
