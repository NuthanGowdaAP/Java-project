package customsorting;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;  // acending order
		//	return o2.age-o1.age;  // descending order
		
		// o1-> object to be inserted 
		// o2-> already existing object
	}

}
