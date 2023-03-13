package com;

public class Account 
{
    private static Account obj; //Account obj=null;
	
	private Account()
	{
		System.out.println("object Created");
	}
	public static Account createObject()
	{
		if(obj==null)
		{
			obj=new Account();//Only 1 object can be created
			return obj;
		}
		else
		{
			System.out.println("Object already Created--->Only 1 object can be created");
		}
		return obj;
	}
}
