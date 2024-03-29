package com.raj.basicprograms;

import java.util.Scanner;

public class RangeOfArmstrong 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int m = scn.nextInt();
		System.out.println("Enter Second Number");
		int n = scn.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
				i =  i+1;
				System.out.println("-----------------");
			}
		}
	}
	static boolean isArmstrong(int k)
	{
		int temp = k;
		int count = 0;
		while(k>0)
		{
			count++;
			k = k/10;
		}
		System.out.println("length of "+temp+" = "+count);
		int sum = 0;
		k = temp;
		while(k>0)
		{
			int prod = 1;
			int digit = k%10;
			for(int i=1;i<=count;i++)
			{
				prod = prod*digit;
			}
			sum = sum+prod;
		}
		System.out.println("sum = "+sum);
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
