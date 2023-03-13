package com;
public class BankImp implements Bank
{
	int balance;
	public BankImp(int balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance+=amount; //balance=balance+amount;
		System.out.println("Amount Deposited Successfully!");
	}
	@Override
	public void withdraw(int amount) 
	{
		if(balance>amount)
		{
			System.out.println("withdrawing Rs."+amount);
			balance-=amount; //balance=balance-amount;
			System.out.println("Amount Withdraw Successfully!");
		}
		else
		{
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int checkBalence() {
		return balance;
	}

}
