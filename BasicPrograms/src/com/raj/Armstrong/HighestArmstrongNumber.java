package com.raj.Armstrong;

import java.util.Scanner;

public class HighestArmstrongNumber
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First Number");
		int m = scn.nextInt();
		System.out.println("Enter Second Number");
		int n = scn.nextInt();
		for(int i=n;i>=m;i--)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
				break;
			}
		}
		
	}
	static boolean isArmstrong(int n)
	{
		int temp =  n;
		int count = 0;
		while(n>0)
		{
			count++;
			n = n/10;
		}
		n = temp;
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			int prod = 1;
			for(int i=1;i<=count;i++)
			{
				prod = prod*rem;
			}
			sum = sum + prod;
			n = n/10;
		}
		if(sum==temp)
		{
			return true;
			
		}
		else return false;
		
	}


	

}
