package com.raj.exception;

import java.util.Scanner;

class Account
{
	private int bal;
	public Account(int b)
	{
		bal = b;
	}
	public int getbal()
	{
		return bal;
	}
	public void withdraw(int amt) throws InsufficientBalance
	{
		if(amt>bal)
		{
			throw new InsufficientBalance();
		}
		bal = bal-amt;
	}
}
class InsufficientBalance extends Exception
{
	public InsufficientBalance()
	{
		super("less balance");
	}
	public InsufficientBalance(String s)
	{
		super(s);
	}
}
public class BankApp
{

	public static void main(String[] args)
	{
		Account a1 = new Account(2000);
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Amount");
		int a = scn.nextInt();
		try {
			a1.withdraw(a);
			System.out.println("Amount Withdrawn");
			System.out.println("current balance is = "+a1.getbal());
		} catch (InsufficientBalance e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
