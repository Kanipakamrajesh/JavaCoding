package com.raj.basicprograms;

import java.util.Scanner;

public class BigggestPrime 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int m = scn.nextInt();
		System.out.println("Enter a second Number");
		int n = scn.nextInt();
		for(int i=n;i>=m;i--)
		{
			if(isPrime(i))
			{
				System.out.println(i);
				break;
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
