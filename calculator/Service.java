package com.java.calculator;

public class Service   // object Creation layer
{
public Calculator createobject()
{
	Calculator c=new Calculation();  // upcasting
	return c;
}
}
