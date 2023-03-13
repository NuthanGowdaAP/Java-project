package customsorting;
import java.util.TreeSet;
public class StrudentSolution 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(21);
		Student s2=new Student(22);
		Student s3=new Student(23);
    	//SortStudentByAge age=new SortStudentByAge();
		//TreeSet<Student> t1=new TreeSet<Student>(age);
		TreeSet<Student> t1=new TreeSet<Student>(new SortStudentByAge());
		t1.add(s1);
		t1.add(s3);
		t1.add(s2);
		for(Student s:t1)
		{
			System.out.println(s);
		}
	}
}
