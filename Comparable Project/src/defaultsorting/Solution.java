package defaultsorting;
import java.util.TreeSet;
public class Solution    // Integer Objects -> intenally compareTo() get called
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(30);
		t.add(0);
		t.add(20);
		for(Integer i:t)
		{
			System.out.println(i);
		}
	}
}
//public class Solution    // String Objects -> intenally compareTo() get called
//{
//	public static void main(String[] args) 
// {
//		TreeSet<String> t=new TreeSet<String>();
//		t.add("B");
//		t.add("A");
//		t.add("C");
//		for(String i:t)
//		{
//			System.out.println(i);
//		}
//	}
//}

/**
 1.when you add an object into TreeSet, intenally compareTo() get called
 2.return tye of compareTo() is int, +1 -> >   40.comapareTo(30)--> 40>30 / 40-30
                                     -1 -> <   10.comapareTo(30)--> 10<30 / 10-30
                                      0 -> ==  30.comapareTo(30)--> 30==30 / 30==30
 3.Travaersing Order -> leftnode,parentnode,rightnode
 4.Underlined DataStructue -> Binary Tree
 5.compareTo() is present in all the Wrapper classes and String class.
 6.When you add Integer object into TreeSet,compareTo() of Intereger class gets called,
   String object-->compareTo() of String class gets called.
 */