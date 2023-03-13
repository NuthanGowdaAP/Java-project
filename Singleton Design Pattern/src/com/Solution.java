package com;

public class Solution
{

	public static void main(String[] args) 
	{
		Account.createObject();
		Account.createObject();
		Account.createObject();
		System.out.println("***********************************************************");
		PrimeMinistor pm=PrimeMinistor.createObject();
		System.out.println(pm);
		System.out.println("Pm name is:"+pm.Name);
		System.out.println("Pm Age is:"+pm.Age);
		//PrimeMinistor.createObject();
		System.out.println("***********************************************************");
		AadharCard a=AadharCard.createObject();
		System.out.println(a);
		System.out.println("AadharCard name is:"+a.Name);
		System.out.println("AadharCard number is:"+a.Aadharno);
	}

}
