package com.raj.Armstrong;

import java.util.Scanner;

public class ArmStrongOrNot
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int count = 0;
		int temp = n;
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
			System.out.println("Armstrong");
		}
		else System.out.println("No");
	}

}
