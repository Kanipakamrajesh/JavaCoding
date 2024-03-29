package com.raj.basicprograms;

import java.util.Scanner;

public class PerfectNumber 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int temp=n;
		int sum = 0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum==temp)
		{
			System.out.println("Given Number is Perfect");
		}
		else
		{
			System.out.println("Given Number is Not Perfect");
		}
	}

}
