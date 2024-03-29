package com.raj.Practice;

import java.util.Scanner;

public class FibonacciOrNot
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		while(c<n)
		{
			c = a + b;
			a = b;
			b = c;
		}
		if(n==c)
		{
			System.out.println("Number is fibonacci");
		}
		else System.out.println("Number is Not a fibonacci");
	}

}
