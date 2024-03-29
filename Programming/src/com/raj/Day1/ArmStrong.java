package com.raj.Day1;

import java.util.Scanner;

public class ArmStrong 
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
		System.out.println("Length is "+count);
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
			System.out.println("product="+prod);
			n = n/10;
		}
		System.out.println("Sum = "+sum);
		if(temp==sum)
		{
			System.out.println("ArmStrong");
		}
		else 
		{
			System.out.println("Not ArmStrong");
		}
		
	}

}
