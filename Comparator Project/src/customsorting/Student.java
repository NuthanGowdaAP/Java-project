package customsorting;

public class Student
{
	int age;
	public Student(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "Age: "+age;
	}
}
/**
Comparator Rules:-
-----------------
1.create a new class which implenets comparator interface & import from java.util package
2.Spcify generics.
3.Override Comapare()
  syntax: public int comparator(Element e1,Element e2)
4.create an object of the soting logic class & pass it to the Consrtuctor of TreeSet
*/