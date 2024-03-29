package com.raj.common;

import java.util.Scanner;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first Nuumber");
		int m = scn.nextInt();
		System.out.println("Enter second number");
		int n = scn.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(isPerfect(i))
			{
				System.out.println(i);
			}
		}
		System.out.println("Enter a Number");
		int x = scn.nextInt();
		if(isPerfect(x))
		{
			System.out.println("Perfect");
		}
		else System.out.println("No");
		
	}
	static boolean isPerfect(int n)
	{
		int sum = 0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			sum = sum + i;
		}
		if(sum==n)
		{
			return true;
		}
		else return false;
	}

}
