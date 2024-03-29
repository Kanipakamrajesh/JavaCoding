package com.raj.Day2;

import java.util.Scanner;

public class PrimeNumber
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		if(n<=1)
		{
			System.out.println("Given Number is Not a Prime Number");
			return; 
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("is Not aPrime Number");
				break;
			}
		}
		System.out.println("Prime Number");
	}

}
