package com.java.calculator;
public class CalculatorMain    // object Utilization layer
{
	public static void main(String[] args)
	{
		Service s1 =new Service();
		 Calculator c=s1.createobject();
		   c.add(1,4);
		   c.sub(10, 5);
	       c.mul(10,2);
	       c.div(10,0);
	       c.div(10,3);
	     }
}