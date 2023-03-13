package defaultsorting;

public class Car implements Comparable<Car>
{
	int cost;
	public Car(int cost)
	{
		this.cost=cost;
	}
	@Override
	public String toString()
	{
		return "Cost: "+cost;
	}
	@Override
	public int compareTo(Car c)
	{
	      return this.cost-c.cost;  // acending Order
		//return c.cost-this.cost;  // descending Order
	      
	  //this->object to be inserted , c- already existing object
	}
}
/**
 Rules for comparing object using camparable
 1.class should implements comparable interface (pesent in java.lang package).
 2.Specify Generics <Object>
 3 Override compareTo(Object o)--> syntax:public int compareTo(Elements e)	
 */