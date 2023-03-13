package factorydesignpattern;
class OnlineShopping
{

}
class Amazon extends OnlineShopping
{

}
class Flipkart extends OnlineShopping
{

}
class Myntra extends OnlineShopping
{

}
class Customer
{
	public OnlineShopping selectApp(int choice)
	{
		if(choice==1)
		{
			Amazon a=new Amazon();
			return a;
		}
		if(choice==2)
		{
			Flipkart f=new Flipkart();
			return f;
		}
		if(choice==3)
		{
			Myntra r=new Myntra();
			return r;
		}
		else
		{
			return null;
		}
	}
}
public class CustomerSolution
{
	public static void main(String[] args) 
	{
		Customer c=new Customer();
		OnlineShopping obj=c.selectApp(1);

		if(obj instanceof Amazon)
		{
			System.out.println("Amazon app");	
		}
		else if(obj instanceof Flipkart)
		{
			System.out.println("Flipkart app");	
		}
		else if(obj instanceof Myntra)
		{
			System.out.println("Myntra app");	
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}