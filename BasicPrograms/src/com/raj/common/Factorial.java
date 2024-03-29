package com.raj.common;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Numbeer");
		long n = scn.nextLong();
		long sum = 0,fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		sum = sum + fact;
		System.out.println(n+"!"+" = "+sum);
	}

}
