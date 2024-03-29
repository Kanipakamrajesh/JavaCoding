package com.raj.basicprograms;

import java.util.Scanner;

public class RangeOfPerfect
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int m = scn.nextInt();
		System.out.println("Enter Seconf Number");
		int n = scn.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(isPerfect(i))
			{
				System.out.println(i);
			}
		}
		
	}
	static boolean isPerfect(int k)
	{
		int temp = k;
		int sum = 0;
		for(int i=1;i<=k/2;i++)
		{
		    if(k%i==0)
		    {
		    	sum = sum+i;
		    }
		}
		if(sum==temp)
		{
			return true;
		}
		return false;
	}

}
