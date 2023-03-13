package factorydesignpattern;
class Taxi
{

}
class Ola extends Taxi
{

}
class Uber extends Taxi
{

}
class Rapido extends Taxi
{

}
class Mobile
{
	public Taxi selectApp(int choice)
	{
		if(choice==1)
		{
			Ola o=new Ola();
			return o;
		}
		if(choice==2)
		{
			Uber u=new Uber();
			return u;
		}
		if(choice==3)
		{
			Rapido r=new Rapido();
			return r;
		}
		else
		{
			return null;
		}
	}
}
public class MobileSolution
{
	public static void main(String[] args) 
	{
		Mobile m=new Mobile();

		Taxi obj=m.selectApp(4);

		if(obj instanceof Ola)
		{
			System.out.println("Ola Booked");	
		}
		else if(obj instanceof Uber)
		{
			System.out.println("Uber Booked");	
		}
		else if(obj instanceof Rapido)
		{
			System.out.println("Rapido Booked");	
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}