package factorydesignpattern;
class Food
{

}
class Biryani extends Food
{

}
class CurdRice extends Food
{

}
class FriedRice extends Food
{

}
class Hotel
{
	public Food orderfood(int choice)
	{
		if(choice==1)
		{
			Biryani B=new Biryani();
			return B;
		}
		if(choice==2)
		{
			CurdRice c=new CurdRice();
			return c;
		}
		if(choice==3)
		{
			FriedRice f=new FriedRice();
			return f;
		}
		else
		{
			return null;
		}
	}
}
public class HotelSolution 
{
	public static void main(String[] args) 
	{
		Hotel hotel=new Hotel();
		//generalization or Upcating or (Factory Design Pattern)
		//Food obj=hotel.orderfood(1);--> returns(new Biryani())-->Food obj=new Biryani();

		Food obj=hotel.orderfood(3);

		if(obj instanceof Biryani)
		{
			System.out.println("Eating Biriyani");	
		}
		else if(obj instanceof CurdRice)
		{
			System.out.println("Eating CurdRice");	
		}
		else if(obj instanceof FriedRice)
		{
			System.out.println("Eating FriedRice");	
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}