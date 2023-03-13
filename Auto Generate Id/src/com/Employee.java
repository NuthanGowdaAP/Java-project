package com;

public class Employee 
{
 String id;
 String name;
 static int count=101;  // Auto generated Id program
 public Employee(String name)
 {
	 this.id="JSP"+count;  // concatination  "JSP"+101; , "JSP"+102; 
	 this.name=name;
	 count++; // count will incremengt 101+1=102
 }
	public static void main(String[] args) {
		
		Employee e1=new Employee("manju");
		System.out.println("Name:"+e1.name +"  Id:"+e1.id);
		
		Employee e2=new Employee("manju");
		System.out.println("Name:"+e2.name +"  Id:"+e2.id);
	}

}
