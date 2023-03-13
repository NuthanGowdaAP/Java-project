// make return statments 
// like this----> public int add(int a,int b);

//package com.java.calculator;
//import java.util.Scanner;
//public class CalculaterMainMethod
//{
//   public static void main(String[] args)
//	{
//	Scanner sc=new Scanner(System.in);
//	Calculator c=new CalculatorImplementation();
//	
//	System.out.println("--------------welcome to claculater Project-----------");
//	System.out.println("======================================================");
//	System.out.println("1:Addition\n2:substraction\n3:munltiplication\n4:divition\n5:Exit"); // \n--->next line
//	
//	while(true)  // uesd for continue repetation alwyas it is true
//	{
//		int a=0;
//		int b=0;
//		System.out.println("Enter Choices:");
//		int choice=sc.nextInt();
//		
//         if(choice>=1 && choice<=4)
//         {
//        	 System.out.println("enter first number");
//     		a=sc.nextInt();
//     		System.out.println("enter second number");
//     		b=sc.nextInt();
//         }
//		switch(choice)
//		  {
//		case 1:
//	       int sum=c.add(a, b);
//		   System.out.println("product:"+sum);
//		   break;
//		case 2:
//		   int sub=c.sub(a, b);
//		   System.out.println("sub:"+sub);
//	        break;
//		case 3:
//		   System.out.println("mul:"+c.mul(a, b)); // line will reduced c.mul(a, b)
//	        break;
//		case 4:
//		   System.out.println("div:"+c.div(a, b));
//	        break;
//		case 5:
//			System.out.println("Thank you...!\nExited");
//			System.exit(0);
//			break;
//		default: 
//			System.out.println("invalid number");
//	     }
//	     System.out.println("==========================================================");  
//	}
//	
//   }
//}