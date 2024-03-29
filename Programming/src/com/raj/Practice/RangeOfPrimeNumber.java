package com.raj.Practice;

import java.util.Scanner;

public class RangeOfPrimeNumber
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first Number");
		int start = scn.nextInt();
		System.out.println("Enter second Number");
		int end = scn.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i)) {
			System.out.println(i);
			i=i+2;
			}
			
		}
	}
	static boolean isPrime(int n) 
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
}
	
