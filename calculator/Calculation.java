package com.java.calculator;

public class Calculation implements Calculator  // object implementation layer
{
	@Override
	 public int add(int a,int b)
	  {
		int sum=a+b;
		System.out.println("sum :"+sum);
		return sum;
	  }
	@Override
	public int sub(int a,int b)
	  {
		int sub=a-b;
		System.out.println("sub :"+sub);
		return sub;
	  }
	@Override
	public int mul(int a,int b)
	  {
		int mul=a*b;
		System.out.println("mul :"+mul);
		return mul;
	  }
	@Override
	public double div(double a,double b)
	  {
		if(b>0)
		{
			double div=a/b;
			System.out.println("div :"+div);
			return div;
		}
		else
		{
			System.out.println("div : b is not equal to zero and less than zero");
		}
		return 0;
	  }

}
