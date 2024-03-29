package com.raj.basicprograms;

import java.util.Scanner;

public class ArmstrongNumber
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int temp = n;
		int count = 0;
		while(n>0)
		{
			count++;
			n = n/10;
		}
		System.out.println("length of "+temp+" is "+count);
		int sum = 0;
		n = temp;
		while(n>0)
		{
			int digit = n%10;
			int prod = 1;
			for(int i=1;i<=count;i++)
			{
				prod = prod*digit;
			}
			sum = sum+prod;
			n = n/10;
		}
		System.out.println("sum = "+sum);
		if(sum==temp)
		{
			System.out.println("Given Number is Armstrong");
		}
		else
		{
			System.out.println("Given Number is Not Armstrong");
		}
	}

}
