package com;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) {
		System.out.println("Welcome to My Bank..!");
		System.out.println("----------------------");

		Scanner sc=new Scanner(System.in);
		Bank Bank=new BankImp(3000); // upcating
		while(true)
		{
			System.out.println("1.Deposit Amount\n2.Withdraw Amount\n3.Check Balance\n4.Exit");
			System.out.println("Enter Choice");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to be deposited:");
				Bank.deposit(sc.nextInt());
				System.out.println("-----------------------------------");
				break;
			case 2:
				System.out.println("Enter the amount to be withdrawn:");
				Bank.withdraw(sc.nextInt());
				System.out.println("-----------------------------------");
				break;
			case 3:
				System.out.println(Bank.checkBalence());
				System.out.println("-----------------------------------");
				break;
			case 4:
				System.out.println("Thank you..!");
				System.exit(0);
				break;
			default :
				throw new InvalidChoiceException("InvalidChoice");
			}
		}
	}
}
