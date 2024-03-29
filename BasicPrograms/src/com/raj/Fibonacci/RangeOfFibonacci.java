package com.raj.Fibonacci;

import java.util.Scanner;

public class RangeOfFibonacci 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number");
		int m = scn.nextInt();
		System.out.println("Enter second number");
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		if(m<=0)
		{
			System.out.println(0);
			return;
		}
		System.out.print(a+" "+b);
		while(true)
		{
			c = a+b;
			if(c>=n)
			{
				break;
			}
			if(c>=m)
			{
				System.out.print(" "+c);
			}
			a = b;
			b = c;
		}
		
	}

}
