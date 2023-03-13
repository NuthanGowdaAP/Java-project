package com;

public class PrimeMinistor {
	//Rule-3
	private static PrimeMinistor pm; //PrimeMinistor pm=null;
	String Name="Mr.Modi";
	int Age=70;

	//Rule-1
	private PrimeMinistor()
	{
		System.out.println("Pm Elected");
	}
	//Rule-2
	public static PrimeMinistor createObject()
	{
		if(pm==null)
		{
			pm=new PrimeMinistor();//Only 1 object can be created
		}
		else
		{
			System.out.println("Pm already elected ");
		}
		return pm;
	}
	@Override
	public String toString() {
		return "PrimeMinistor [Name=" + Name + ", age=" + Age + "]";
	}
}
