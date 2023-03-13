package com;

public class AadharCard {
	//Rule-3
	private static AadharCard a; //PrimeMinistor pm=null;
	String Name="Mr.Manjunath B kalasa";
	int Aadharno=123456789;

	//Rule-1
	private AadharCard()
	{
		System.out.println("AadharCard generated");
	}
	//Rule-2
	public static AadharCard createObject()
	{
		if(a==null)
		{
			a=new AadharCard();//Only 1 object can be created
		}
		else
		{
			System.out.println("AadharCard already generated ");
		}
		return a;
	}
	@Override
	public String toString() {
		return "AadharCard [Name=" + Name + ", age=" + Aadharno + "]";
	}
}
