package com.raj.basicprograms;

import java.util.Scanner;

public class PerfectNumbers 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(isPerfect(i))
			{
				System.out.println(i);
			}
		}

	}
	static boolean isPerfect(int m)
	{
		int temp = m;
		int sum = 0;
		for(int i=1;i<=m/2;i++)
		{
			if(m%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
